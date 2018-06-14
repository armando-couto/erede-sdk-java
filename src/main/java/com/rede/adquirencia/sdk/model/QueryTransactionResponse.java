/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe QueryTransactionResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import java.util.List;
import com.google.gson.Gson;

/**
 * TransactionQueryResponse class.
 */
public class QueryTransactionResponse extends ResponseBase {
	String requestDateTime;
	AuthorizationResponse authorization;
	CaptureResponse capture;
	IataResponse iata;
	ThreeDSecureResponse threeDSecure;
	List<RefundResponse> refunds;	
	
	/**
	 * Get RequestDateTime property.
	 * @return RequestDateTime.
	 */
	public String getRequestDateTime() {
		return requestDateTime;
	}
	
	/**
	 * Set RequestDateTime property.
	 * @param requestDateTime
	 */
	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	
	/**
	 * Get Authorization property.
	 * @return Authorization.
	 */
	public AuthorizationResponse getAuthorization() {
		return authorization;
	}
	
	/**
	 * Set Authorization property.
	 * @param authorization
	 */
	public void setAuthorization(AuthorizationResponse authorization) {
		this.authorization = authorization;
	}
	
	/**
	 * Get Capture property.
	 * @return Capture.
	 */
	public CaptureResponse getCapture() {
		return capture;
	}
	
	/**
	 * Set Capture property.
	 * @param capture
	 */
	public void setCapture(CaptureResponse capture) {
		this.capture = capture;
	}
	
	/**
	 * Get Iata property.
	 * @return Iata.
	 */
	public IataResponse getIata() {
		return iata;
	}
	
	/**
	 * Set Iata property.
	 * @param iata
	 */
	public void setIata(IataResponse iata) {
		this.iata = iata;
	}
	
	/**
	 * Get ThreeDs property.
	 * @return ThreeDSecure.
	 */
	public ThreeDSecureResponse getThreeDSecure() {
		return threeDSecure;
	}
	
	/**
	 * Set ThreeDs property.
	 * @param threeDSecure
	 */
	
	public void setThreeDSecure(ThreeDSecureResponse threeDSecure) {
		this.threeDSecure = threeDSecure;
	}
	
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

	/**
	 * Map Json to QueryTransactionResponse.
	 * @param jsonString
	 * @return
	 */
	public static QueryTransactionResponse map(String jsonString){
		Gson gson = new Gson();
		return gson.fromJson(jsonString, QueryTransactionResponse.class);
	}
}
