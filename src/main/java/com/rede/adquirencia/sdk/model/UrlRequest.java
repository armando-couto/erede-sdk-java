/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe UrlRequest
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * UrlRequest class.
 */
public class UrlRequest {
	UrlKind kind;
	String url;
	
	/**
	 * get kind property.
	 * @return kind
	 */
	public UrlKind getKind() {
		return kind;
	}
	
	/**
	 * set kind property.
	 * @param kind
	 */
	public void setKind(UrlKind kind) {
		this.kind = kind;
	}
	
	/**
	 * Get url property.
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * set url property.
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
