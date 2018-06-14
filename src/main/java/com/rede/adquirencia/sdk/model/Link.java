/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Link
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * Link class.
 */
public class Link {
	private String method;
	String rel;
	String href;
	
	/**
	 * Get method property.
	 * @return method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Set method property.
	 * @param method
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	
	/**
	 * Get rel property.
	 * @return rel
	 */
	public String getRel() {
		return rel;
	}
	
	/**
	 * Set rel property.
	 * @param rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/**
	 * Get href property.
	 * @return href
	 */
	public String getHref() {
		return href;
	}
	
	/**
	 * Set href property.
	 * @param href
	 */
	public void setHref(String href) {
		this.href = href;
	}
}
