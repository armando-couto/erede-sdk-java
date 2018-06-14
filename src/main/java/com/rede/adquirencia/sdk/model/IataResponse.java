/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe IataResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * IataResponse class.
 */
public class IataResponse {
	String code;
	int departureTax;
	
	/**
	 * Get Code property.
	 * @return Code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Set Code property.
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Get DepartureTax property.
	 * @return DepartureTax.
	 */
	public int getDepartureTax() {
		return departureTax;
	}
	
	/**
	 * Set DepartureTax property.
	 * @param departureTax
	 */
	public void setDepartureTax(int departureTax) {
		this.departureTax = departureTax;
	}
}
