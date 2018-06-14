/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe AuthorizationResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * AuthorizationResponse class.
 */
public class AuthorizationResponse extends ResponseBase {
	String dateTime;
	String affiliation;
	String status;
	String reference;
	String tid;
	String nsu;
	String authorizationCode;
	Kind kind;
	int amount;
	int installments;
	String cardHolderName;
	String cardBin;
	String last4;
	String softDescriptor;
	int origin;
	boolean subscription;
	String distributorAffiliation;
	
	/**
	 * Get DateTime property.
	 * @return DateTime.
	 */
	public String getDateTime() {
		return dateTime;
	}
	
	/**
	 * Set DateTime property
	 * @param dateTime
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	/**
	 * Get Affiliation property.
	 * @return
	 */
	public String getAffiliation() {
		return affiliation;
	}
	
	/**
	 * Set Affiliation property.
	 * @param affiliation
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	
	/**
	 * Get Status property,
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
	 * Get PaymentMethod property.
	 * @return
	 */
	public Kind getKind() {
		return kind;
	}
	
	/**
	 * Set PaymentMethod property.
	 * @param paymentMethod
	 */
	public void setKind(Kind kind) {
		this.kind = kind;
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
	
	/**
	 * Get Installments property.
	 * @return Installments.
	 */
	public int getInstallments() {
		return installments;
	}
	
	/**
	 * Set Installments property.
	 * @param installments
	 */
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	
	/**
	 * Get CardHolderName property.
	 * @return CardHolderName.
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}
	
	/**
	 * Set CardHolderName property.
	 * @param cardHolderName
	 */
	public void setCardHolderName(String cardholderName) {
		this.cardHolderName = cardholderName;
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
	 * Get Softdescriptor property.
	 * @return Softdescriptor.
	 */
	public String getSoftDescriptor() {
		return softDescriptor;
	}
	
	/**
	 * Set Softdescriptor property.
	 * @param softdescriptor
	 */
	public void setSoftdescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}
	
	/**
	 * Get Origin property.
	 * @return Origin.
	 */
	public int getOrigin() {
		return origin;
	}
	
	/**
	 * Set Origin property.
	 * @param origin
	 */
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	
	/**
	 * Get Subscription property.
	 * @return Subscription.
	 */
	public boolean getSubscription() {
		return subscription;
	}
	
	/**
	 * Set Subscription property.
	 * @param subscription
	 */
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}
	
	/**
	 * Get DistributorAffiliation property.
	 * @return DistributorAffiliation.
	 */
	public String getDistributorAffiliation() {
		return distributorAffiliation;
	}
	
	/**
	 * Set DistributorAffiliation property.
	 * @param distributorAffiliation
	 */
	public void setDistributorAffiliation(String distributorAffiliation) {
		this.distributorAffiliation = distributorAffiliation;
	}
}
