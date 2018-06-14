/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Requestor
* Autor : Danilo Elias
* Data : 09/03/2018
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk;

import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.HttpMethodRequest;
import com.rede.adquirencia.sdk.model.Security;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public abstract class Requestor {
    private static final String ENCODING = "UTF-8";
	private final Security security;
    private HttpClient httpClient;
    
    /**
	 * Constructor
	 * @param affiliation
	 * @param token
	 * @param environment
	 */
    public Requestor(String affiliation, String token, EnvironmentType environment) {
        security = new Security(affiliation, token, environment);
    }

    /**
	 * Set HttpClient for requests.
	 * @param httpClient
	 */
	public void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
    }

    /**
     * Executes Http GET request.
     * @param path path to get
     * @return String http response
     */
    protected String executeGet(String path) throws Exception {
        return execute(getHttpRequest(HttpMethodRequest.GET, path, null));
    }

    /**
     * Executes Http POST request.
     * @param path path to get
     * @param content object to post
     * @return String http response
     */
    protected String executePost(String path, Object content) throws Exception {
        return execute(getHttpRequest(HttpMethodRequest.POST, path, content));
    }

    /**
     * Executes Http PUT request.
     * @param path path to get
     * @param content object to put
     * @return String http response
     */
    protected String executePut(String path, Object content) throws Exception {
        return execute(getHttpRequest(HttpMethodRequest.PUT, path, content));
    }
    
    /**
     * Executes http request.
     * @param request http request
     * @return String http response
     */
    private String execute(HttpRequestBase request) throws Exception {
		if (httpClient == null) {
			httpClient = HttpClientBuilder.create().build();
		}

		HttpResponse response = httpClient.execute(request);

		return EntityUtils.toString(response.getEntity(), ENCODING);
    }

    /**
	 * Get http request.
	 * @param verb http verb
	 * @param path api path
	 * @param request object to send
	 * @return HttpRequestBase http request
	 * @throws UnsupportedEncodingException
	 */
	private HttpRequestBase getHttpRequest(HttpMethodRequest verb, String path, Object request) throws UnsupportedEncodingException {
        HttpRequestBase req;
        String url = getUrl() + path;
		
		switch (verb) {
            case GET:
                req = new HttpGet(url);
                break;
            case POST:
                req = new HttpPost(url);
                ((HttpPost)req).setEntity(new StringEntity(toJSon(request), ENCODING));
                break;
            case PUT:
                req = new HttpPut(url);
                ((HttpPut)req).setEntity(new StringEntity(toJSon(request), ENCODING));
                break;
            default:
                req = null;
                break;
		}
		
		if (req != null) {
			req.addHeader("content-type", "application/json");

			String auth = security.getAffiliation() + ":" + security.getToken();
			String authHeader = "Basic " + Base64.encodeBase64String(auth.getBytes(ENCODING));
			req.addHeader("Authorization", authHeader);
		}

		return req;
	}
    
    /**
	 * Get the url according to Environment.
	 * @param type
	 * @return String
	 */
	private String getUrl() {
		String url;

		switch (security.getEnvironment()) {
            case HOMOLOG:
                url = "https://api.userede.com.br/desenvolvedores/v1/";
                break;
            case PRODUCTION:
                url = "https://api.userede.com.br/erede/v1/";
				break;
			default:
				url = "";
				break;
		}

		return url;
    }
    
    /**
	 * Convert object to Json.
	 * @param request
	 * @return Json
	 */
	private String toJSon(Object request){
		Gson gson = new Gson();
		return gson.toJson(request);
	}
}