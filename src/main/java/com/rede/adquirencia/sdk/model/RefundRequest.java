/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe RefundRequest
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;
import java.util.List;;

/**
 *  RefundRequest class.
 */
public class RefundRequest {
	int amount;
	List<UrlRequest> urls;
	
	/**
	 * Get Amount property.
	 * @return Amount.
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * Set Amount property.
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Get Urls property.
	 * @return Urls
	 */
	public List<UrlRequest> getUrls() {
		return urls;
	}
	
	/**
	 * Set Urls property.
	 * @param urls
	 */
	public void setUrls(List<UrlRequest> urls) {
		this.urls = urls;
	}
}
