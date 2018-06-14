/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe ThreeDSecureRequest
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * ThreeDSecureRequest class.
 */
public class ThreeDSecureRequest {
	Boolean embedded;
	String onFailure;
	String eci;
	String cavv;
	String xid;
	String userAgent;
	
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
	 *  Set Cavv property.
	 * @param cavv
	 */
	public void setCavv(String cavv) {
		this.cavv = cavv;
	}
	
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
	 * Get Embedded property.
	 * @return Embedded.
	 */
	public Boolean getEmbedded() {
		return embedded;
	}
	
	/**
	 * 
	 * @param embedded
	 */
	public void setEmbedded(Boolean embedded) {
		this.embedded = embedded;
	}
	
	/**
	 * Get OnFailure property.
	 * @return OnFailure.
	 */
	public String getOnFailure() {
		return onFailure;
	}
	
	/**
	 * Set OnFailure property.
	 * @param onFailure
	 */
	public void setOnFailure(String onFailure) {
		this.onFailure = onFailure;
	}
	
	/**
	 * Get UserAgent property.
	 * @return UserAgent.
	 */
	public String getUserAgent() {
		return userAgent;
	}
	
	/**
	 * Set UserAgent property.
	 * @param userAgent
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
