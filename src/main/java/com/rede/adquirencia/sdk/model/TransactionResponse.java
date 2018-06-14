/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe TransactionResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import com.google.gson.Gson;

/**
 * TransactionResponse class.
 */
public class TransactionResponse extends ResponseBase { 
	String reference;
	String tid;
	String nsu;
	String authorizationCode;
	String dateTime;
	Integer amount;
	Integer installments;
	String cardBin;
	String last4;
	ThreeDSecureResponse threeDSecure;
	
	/**
	 * Get Reference property.
	 * @return Reference.
	 */
	public String getReference() {
		return reference;
	}
	
	/**
	 * Set Reference property.
	 * @param reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	/**
	 * Get Tid property.
	 * @return Tid.
	 */
	public String getTid() {
		return tid;
	}
	
	/**
	 * Set Tid property.
	 * @param tid
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	/**
	 * Get Nsu property.
	 * @return Nsu.
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
	 * Get AuthorizationCode property.
	 * @return AuthorizationCode.
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	
	/**
	 * Set AuthorizationCode property.
	 * @param authorizationCode
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
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
	
	/**
	 * Get Amount property.
	 * @return Amount.
	 */
	public Integer getAmount() {
		return amount;
	}
	
	/**
	 * Set Amount property.
	 * @param amount
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	/**
	 * Installments property.
	 * @return Installments.
	 */
	public Integer getInstallments() {
		return installments;
	}
	
	/**
	 * Set Installments property.
	 * @param installments
	 */
	public void setInstallments(Integer installments) {
		this.installments = installments;
	}
	
	/**
	 * Get CardBin property.
	 * @return CardBin.
	 */
	public String getCardBin() {
		return cardBin;
	}
	
	/**
	 * Set CardBin property.
	 * @param cardBin
	 */
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}
	
	/**
	 * Get Last4 property.
	 * @return Last4.
	 */
	public String getLast4() {
		return last4;
	}
	
	/**
	 * Set Last4 property.
	 * @param last4
	 */
	public void setLast4(String last4) {
		this.last4 = last4;
	}
	
	/**
	 * Get ThreeDs property.
	 * @return ThreeDs.
	 */
	public ThreeDSecureResponse getThreeDSecure() {
		return threeDSecure;
	}
	
	/**
	 * Set ThreeDs property.
	 * @param threeDs
	 */
	public void setThreeDSecure(ThreeDSecureResponse threeDSecure) {
		this.threeDSecure = threeDSecure;
	}
	
	/**
	 * Map Json to transaction Response
	 * @param jsonString
	 * @return
	 */
	public static TransactionResponse map(String jsonString){
		Gson gson = new Gson();
		return gson.fromJson(jsonString, TransactionResponse.class);
	}
}
