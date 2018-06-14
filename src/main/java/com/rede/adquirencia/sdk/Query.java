/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Query
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk;

import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.QueryTransactionResponse;
import com.rede.adquirencia.sdk.model.RefundListResponse;
import com.rede.adquirencia.sdk.model.RefundResponse;

public class Query extends Requestor {

	public Query(String affiliation, String token, EnvironmentType environment){
		super(affiliation, token, environment);
	}
	
	/**
	 * Get a transaction by Tid
	 * @param tid
	 * @return QueryTransactionResponse
	 */
	public QueryTransactionResponse getTransactionByTid(String tid){
		return getTransaction(tid, null);
	}
	
	/**
	 * Get a transaction by Reference
	 * @param reference
	 * @return QueryTransactionResponse
	 */
	public QueryTransactionResponse getTransactionByReference(String reference){
		return getTransaction(null, reference);
	}

	/**
	 * Get a transaction
	 * @param tid
	 * @param reference
	 * @return QueryTransactionResponse
	 */
	public QueryTransactionResponse getTransaction(String tid, String reference){
		QueryTransactionResponse queryTransactionResponse;
		
		try {
			String path = "transactions";
			if (tid != null && !tid.isEmpty())
				path += "/" + tid;
			if (reference != null && !reference.isEmpty())
				path += "?reference=" + reference;
			queryTransactionResponse = QueryTransactionResponse.map(executeGet(path));
		}
		catch (Exception e) {
			queryTransactionResponse = new QueryTransactionResponse();
			queryTransactionResponse.setReturnCode("370");
			queryTransactionResponse.setReturnMessage(e.getMessage());
		}
		
		return queryTransactionResponse;
	}
	
	/**
	 * Get a list of Refunds of a transaction.
	 * @param tid
	 * @return RefundListResponse.
	 */
	public RefundListResponse getRefunds(String tid){		
		RefundListResponse refundListResponse;
		
		try {
			String path = String.format("transactions/%s/refunds", tid);
			refundListResponse = RefundListResponse.map(executeGet(path));
		}
		catch (Exception e) {
			refundListResponse = new RefundListResponse();
			refundListResponse.setReturnCode("370");
			refundListResponse.setReturnMessage(e.getMessage());
		}
		
		return refundListResponse;
	}
	
	/**
	 * Get a specific refund of a transaction.
	 * @param tid
	 * @param refundId
	 * @return RefundResponse.
	 */
	public RefundResponse getRefund(String tid, String refundId){		
		RefundResponse refundResponse;
		
		try {
			String path = String.format("transactions/%s/refunds/%s", tid, refundId);
			refundResponse = RefundResponse.map(executeGet(path));
		}
		catch (Exception e) {
			refundResponse = new RefundResponse();
			refundResponse.setReturnCode("370");
			refundResponse.setReturnMessage(e.getMessage());
		}
		
		return refundResponse;
	}
}
