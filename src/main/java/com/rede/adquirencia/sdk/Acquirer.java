/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Acquirer
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk;

import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.RefundRequest;
import com.rede.adquirencia.sdk.model.RefundResponse;
import com.rede.adquirencia.sdk.model.TransactionRequest;
import com.rede.adquirencia.sdk.model.TransactionResponse;

public class Acquirer extends Requestor {

	/**
	 * Constructor
	 * @param affiliation
	 * @param token
	 * @param environment
	 */
	public Acquirer(String affiliation, String token, EnvironmentType environment) {
		super(affiliation, token, environment);
	}
	
	/**
	 * Create a transaction.
	 * @param request
	 * @return TransactionResponse.
	 */
	public TransactionResponse authorize(TransactionRequest request){
		TransactionResponse transactionResponse;
		
		try {
			String path = "transactions";
			transactionResponse = TransactionResponse.map(executePost(path, request));
		}
		catch (Exception e) {
			transactionResponse = new TransactionResponse();
			transactionResponse.setReturnCode("370");
			transactionResponse.setReturnMessage(e.getMessage());
		}
		
		return transactionResponse;
	}
	
	/**
	 * Capture a transaction.
	 * @param request
	 * @return TransactionResponse.
	 */
	public TransactionResponse capture(String tid, TransactionRequest request){
		TransactionResponse transactionResponse;
		
		try {
			String path = String.format("transactions/%s", tid);
			transactionResponse = TransactionResponse.map(executePut(path, request));
		}
		catch (Exception e) {
			transactionResponse = new TransactionResponse();
			transactionResponse.setReturnCode("370");
			transactionResponse.setReturnMessage(e.getMessage());
		}
		
		return transactionResponse;
	}

	/**
	 * Create a refund.
	 * @param tid
	 * @param request
	 * @return RefundResponse
	 */
	public RefundResponse refund(String tid, RefundRequest request){		
		RefundResponse refundResponse;
		
		try {
			String path = String.format("transactions/%s/refunds", tid);
			refundResponse = RefundResponse.map(executePost(path, request));
		}
		catch (Exception ex){
			refundResponse = new RefundResponse();
			refundResponse.setReturnCode("370");
			refundResponse.setReturnMessage(ex.getMessage());
		}
		
		return refundResponse;
	}
}
