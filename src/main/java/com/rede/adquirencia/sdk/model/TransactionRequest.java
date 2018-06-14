/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe TransactionRequest
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import java.util.List;

public class TransactionRequest {	
	Boolean capture;
	Kind kind;
	String reference;
	Integer amount;
	Integer installments;
	String cardHolderName;
	String cardNumber;
	int expirationMonth;
	int expirationYear;
	String securityCode;
	String softDescriptor;
	Boolean subscription;
	Integer origin;
	String distributorAffiliation;
	ThreeDSecureRequest threeDSecure;
	IataRequest iata;
	List<UrlRequest> urls;

	/**
	 * Get Capture property.
	 * @return Capture.
	 */
	public Boolean getCapture() {
		return capture;
	}
	
	/**
	 * Set Capture property.
	 * @param capture
	 */
	public void setCapture(Boolean capture) {
		this.capture = capture;
	}
	
	/**
	 * Get Kind property.
	 * @return Kind.
	 */
	public Kind getKind() {
		return kind;
	}
	
	/**
	 * Set Kind property.
	 * @param kind
	 */
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	/**
	 * Get Reference property.
	 * @return Reference.
	 */
	public String getReference() {
		return reference;
	}
	
	/**
	 * set Reference property.
	 * @param reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
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
	 * Get Installments property.
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
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	/**
	 * Get CardNumber property.
	 * @return CardNumber.
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	
	/**
	 * Set CardNumber property.
	 * @param cardNumber
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	/**
	 * Get ExpirationMonth property.
	 * @return ExpirationMont.
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}
	
	/**
	 * Set ExpirationMonth property.
	 * @param expirationMonth
	 */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	
	/**
	 * Get ExpirationYear property.
	 * @return ExpirationYear.
	 */
	public int getExpirationYear() {
		return expirationYear;
	}
	
	/**
	 *  Set ExpirationYear property.
	 * @param expirationYear
	 */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	
	/**
	 * Get SecurityCode property.
	 * @return SecurityCode.
	 */
	public String getSecurityCode() {
		return securityCode;
	}
	
	/**
	 * Set SecurityCode property.
	 * @param securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	/**
	 * Get SoftDescriptor property.
	 * @return SoftDescriptor.
	 */
	public String getSoftDescriptor() {
		return softDescriptor;
	}
	
	/**
	 * Set SoftDescriptor property.
	 * @param softDescriptor
	 */
	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}
	
	/**
	 * Get Subscription property.
	 * @return Subscription.
	 */
	public Boolean getSubscription() {
		return subscription;
	}
	
	/**
	 * Set Subscription property.
	 * @param subscription
	 */
	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}
	
	/**
	 * Get Origin property.
	 * @return Origin.
	 */
	public Integer getOrigin() {
		return origin;
	}
	
	/**
	 * Set Origin property.
	 * @param origin
	 */
	public void setOrigin(Integer origin) {
		this.origin = origin;
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

	/**
	 * Get threeDSecure property.
	 * @return threeDSecure.
	 */
	public ThreeDSecureRequest getThreeDSecure() {
		return threeDSecure;
	}
	
	/**
	 * Set threeDSecure property.
	 * @param threeDSecure
	 */	
	public void setThreeDSecure(ThreeDSecureRequest threeDSecure) {
		this.threeDSecure = threeDSecure;
	}
	
	/**
	 * Get Iata property.
	 * @return Iata.
	 */
	public IataRequest getIata() {
		return iata;
	}
	
	/**
	 * Set Iata property.
	 * @param iata
	 */
	public void setIata(IataRequest iata) {
		this.iata = iata;
	}
	
	/**
	 * Get Urls property.
	 * @return Urls.
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
