/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe RefundListResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import java.util.List;

import com.google.gson.Gson;

/**
 * RefundListResponse class.
 */
public class RefundListResponse extends ResponseBase {
	List<RefundResponse> refunds;
	
	/**
	 * Get Refunds property.
	 * @return Refunds.
	 */
	public List<RefundResponse> getRefunds() {
		return refunds;
	}
	
	/**
	 * Set Refunds property.
	 * @param refunds
	 */
	public void setRefunds(List<RefundResponse> refunds) {
		this.refunds = refunds;
	}
	
	public static RefundListResponse map(String jsonString){
		Gson gson = new Gson();
		return gson.fromJson(jsonString.replace("3ds", "ThreeDs"), RefundListResponse.class);
	}
}
