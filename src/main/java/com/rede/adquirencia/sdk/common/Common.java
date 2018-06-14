/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Common
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.common;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.core.MediaType;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;

import com.google.gson.Gson;
import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.HttpMethodRequest;
import com.rede.adquirencia.sdk.model.RefundRequest;
import com.rede.adquirencia.sdk.model.Security;
import com.rede.adquirencia.sdk.model.TransactionRequest;

public class Common {
	
	private static final String ENCODING = "UTF-8";

	private Common() {
	}

	/**
	 * Convert object to Json.
	 * @param request
	 * @return Json
	 */
	private static String toJSon(Object request){
		Gson gson = new Gson();
		return gson.toJson(request);
	}
	
	/**
	 * Prepare the UriRequest according to verb and set the Headers.
	 * @param verb
	 * @param url
	 * @param request
	 * @param security
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException
	 */
	private static HttpRequestBase setUriRequest(HttpMethodRequest verb, String url, Object request, Security security) throws UnsupportedEncodingException {
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(security.getAffiliation(), security.getToken());
		HttpRequestBase req = null;
		
		switch (verb) {
		case POST:
			req = new HttpPost(url);
			((HttpPost)req).setEntity(new StringEntity(toJSon(request), ENCODING));
			break;
		case GET:
			req = new HttpGet(url);
			break;
		case PUT:
			req = new HttpPut(url);
			((HttpPut)req).setEntity(new StringEntity(toJSon(request), ENCODING));
			break;
		default:
			break;
		}
		
		if (req != null) {
			req.addHeader("content-type", MediaType.APPLICATION_JSON);
			req.addHeader(BasicScheme.authenticate(creds, ENCODING, false));
		}

		return req;
	}
	
	/**
	 * Get the url according to Environment.
	 * @param type
	 * @return String
	 */
	public static String getUrl(EnvironmentType type) {
		String url;

		switch (type) {
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
	 * Get AuthorizeUrl
	 * @param security
	 * @param request
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException 
	 */
	public static HttpRequestBase getAuthorizeUrl(Security security, TransactionRequest request) throws UnsupportedEncodingException {
		String url = String.format("%stransactions", getUrl(security.getEnvironment()));
		return setUriRequest(HttpMethodRequest.POST, url, request, security);
	}
	
	/**
	 * Get Capture Url.
	 * @param security
	 * @param tid
	 * @param request
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException 
	 */
	public static HttpRequestBase getCaptureUrl(Security security, String tid, TransactionRequest request) throws UnsupportedEncodingException {
		String url = String.format("%stransactions/%s", getUrl(security.getEnvironment()), tid);
		return setUriRequest(HttpMethodRequest.PUT, url, request, security);
	}
	
	/**
	 * Get Refund Url.
	 * @param security
	 * @param tid
	 * @param request
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException 
	 */
	public static HttpRequestBase getRefundUrl(Security security, String tid, RefundRequest request) throws UnsupportedEncodingException {
		String url = String.format("%stransactions/%s/refunds", getUrl(security.getEnvironment()), tid);
		return setUriRequest(HttpMethodRequest.POST, url, request, security);		
	}
	
	/**
	 * Get the Url query transaction
	 * @param security 
	 * @param tid
	 * @param reference
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException
	 */
	public static HttpRequestBase getQueryTransactionUrl(Security security, String tid, String reference) throws UnsupportedEncodingException {
		String url = String.format("%stransactions?tid=%s&reference=%s", getUrl(security.getEnvironment()), tid, reference);
		return setUriRequest(HttpMethodRequest.GET, url, null, security);
	}
	
	/**
	 * Get the Url Query List Refund
	 * @param security 
	 * @param tid
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException
	 */
	public static HttpRequestBase getQueryListRefundsUrl(Security security, String tid) throws UnsupportedEncodingException {
		String url = String.format("%stransactions/%s/refunds", getUrl(security.getEnvironment()), tid);
		return setUriRequest(HttpMethodRequest.GET, url, null, security);
	}
	
	/**
	 * Get the Url query Refund
	 * @param security 
	 * @param tid
	 * @param refundId
	 * @return HttpRequestBase
	 * @throws UnsupportedEncodingException
	 */
	public static HttpRequestBase getQueryRefundUrl(Security security, String tid, String refundId) throws UnsupportedEncodingException {
		String url = String.format("%stransactions/%s/refunds/%s", getUrl(security.getEnvironment()), tid, refundId);
		return setUriRequest(HttpMethodRequest.GET, url, null, security);
	}
}