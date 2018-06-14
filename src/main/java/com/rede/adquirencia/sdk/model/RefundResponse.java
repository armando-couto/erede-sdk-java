/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe RefundResponse
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import java.util.List;

import com.google.gson.Gson;

/**
 * RefundResponse class.
 */
public class RefundResponse extends ResponseBase {
	String refundId;
	String tid;
	String nsu;
	String refundDateTime;
	String cancelId;
	String status;
	String amount;
	List<RefundHistoryResponse> statusHistory;
	
	/**
	 * Get RefundHistoryResponse property.
	 * @return RefundHistoryResponse.
	 */
	public List<RefundHistoryResponse> getStatusHistory() {
		return statusHistory;
	}
	
	/**
	 * Set RefundHistoryResponse property.
	 * @param statusHistory
	 */
	public void setStatusHistory(List<RefundHistoryResponse> statusHistory) {
		this.statusHistory = statusHistory;
	}
	
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
	 * Get Amount property.
	 * @return Amount.
	 */
	public String getAmount() {
		return amount;
	}
	
	/**
	 * Set Amount property.
	 * @param amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	/**
	 * Get RefundId property.
	 * @return RefundId.
	 */
	public String getRefundId() {
		return refundId;
	}
	
	/**
	 * Set RefundId property.
	 * @param refundId
	 */
	public void setRefundId(String refundId) {
		this.refundId = refundId;
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
	 * Get RefundDateTime property.
	 * @return RefundDateTime.
	 */
	public String getRefundDateTime() {
		return refundDateTime;
	}
	
	/**
	 * Set RefundDateTime property.
	 * @param refundDateTime
	 */
	public void setRefundDate(String refundDateTime) {
		this.refundDateTime = refundDateTime;
	}

	/**
	 * Get CancelId property.
	 * @return CancelId.
	 */
	public String getCancelId() {
		return cancelId;
	}
	/**
	 * Set CancelId property.
	 * @param cancelId
	 */
	public void setCancelId(String cancelId) {
		this.cancelId = cancelId;
	}
	
	public static RefundResponse map(String jsonString){
		Gson gson = new Gson();
		return gson.fromJson(jsonString, RefundResponse.class);
	}
}
