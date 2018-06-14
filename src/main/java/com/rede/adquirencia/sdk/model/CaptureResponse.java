/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe CaptureResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import com.google.gson.Gson;

/**
 * CaptureResponse class.
 */
public class CaptureResponse {
	String dateTime;
	String nsu;
	int amount;
	
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

	/**
	 * Get Nsu property.
	 * @return Nsu
	 */
	public String getNsu() {
		return nsu;
	}
	/**
	 * Set Nsu property.
	 * @param nsu
	 */
	public void setNsu(String nsu) {
		this.nsu = nsu;
	}
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
	
	public static CaptureResponse map(String jsonString){
		Gson gson = new Gson();
		return gson.fromJson(jsonString, CaptureResponse.class);
	}
}
