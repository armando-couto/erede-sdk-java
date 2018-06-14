/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe ThreeDSecureResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * ThreeDSecureResponse class.
 */
public class ThreeDSecureResponse extends ResponseBase {	
	boolean embedded;
	String url;
	String xid;
	String eci;
	String cavv;
	
	/**
	 * Get Xid property.
	 * @return Xid.
	 */
	public String getXid() {
		return xid;
	}
	
	/**
	 * Set Xid property.
	 * @param xid
	 */
	public void setXid(String xid) {
		this.xid = xid;
	}
	
	/**
	 * Get Eci property.
	 * @return Eci.
	 */
	public String getEci() {
		return eci;
	}
	
	/**
	 * Set Eci property.
	 * @param eci
	 */
	public void setEci(String eci) {
		this.eci = eci;
	}
	
	/**
	 * Get Cavv property.
	 * @return Cavv.
	 */
	public String getCavv() {
		return cavv;
	}
	
	/**
	 * Set Cavv property.
	 * @param cavv
	 */
	public void setCavv(String cavv) {
		this.cavv = cavv;
	}
	
	/**
	 * Get Embedded property.
	 * @return Embedded.
	 */
	public boolean getEmbedded() {
		return embedded;
	}
	
	/**
	 * Set Embedded property.
	 * @param embedded
	 */
	public void setEmbedded(boolean embedded) {
		this.embedded = embedded;
	}
	
	/**
	 * Get Url property.
	 * @return Url.
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Set Url property.
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
