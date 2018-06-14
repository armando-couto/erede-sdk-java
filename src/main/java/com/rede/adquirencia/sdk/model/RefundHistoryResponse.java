/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe RefundHistoryResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * RefundHistoryResponse class.
 */
public class RefundHistoryResponse {
	String status;
	String dateTime;

	/**
	 * Get Status property.
	 * @return Status.
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Set Status property.
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Get DateTime property.
	 * @return DateTime.
	 */
	public String getDateTime() {
		return dateTime;
	}
	
	/**
	 * Set DateTime property.
	 * @param dateTime
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
