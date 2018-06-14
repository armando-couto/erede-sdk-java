/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe ResponseBase
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import java.util.List;

/**
 * ResponseBase class.
 */
public class ResponseBase {
	String returnCode;
	String returnMessage;
	List<Link> links;
	
	/**
	 * Get ReturnCode property.
	 * @return ReturnCode.
	 */
	public String getReturnCode() {
		return returnCode;
	}
	
	/**
	 * Set ReturnCode property.
	 * @param returnCode
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	
	/**
	 * Get ReturnMessage property.
	 * @return ReturnMessage.
	 */
	public String getReturnMessage() {
		return returnMessage;
	}
	
	/**
	 * Set ReturnMessage property.
	 * @param returnMessage
	 */
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	
	/**
	 * Get Hypermedia links.
	 * @return Links
	 */
	public List<Link> getLinks() {
		return links;
	}
	
	/**
	 * Set Hypermedia links.
	 * @param links
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}	
}
