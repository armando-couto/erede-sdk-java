package com.rede.adquirencia.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import com.google.gson.Gson;
import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.Kind;
import com.rede.adquirencia.sdk.model.QueryTransactionResponse;
import com.rede.adquirencia.sdk.model.RefundListResponse;
import com.rede.adquirencia.sdk.model.RefundRequest;
import com.rede.adquirencia.sdk.model.RefundResponse;
import com.rede.adquirencia.sdk.model.TransactionRequest;
import com.rede.adquirencia.sdk.model.TransactionResponse;

public class QueryTest {

	@Test
	public void queryTransaction(){
		Acquirer ac = new Acquirer("10000205", "c222797e7101493fa9a92a7a555d206e", EnvironmentType.HOMOLOG);

		TransactionRequest request = new TransactionRequest();
    	request.setCapture(true);
    	request.setReference("java" + (new Random()).nextInt(999999999));
    	request.setAmount(2000);
    	request.setCardHolderName("Nome Portador");
    	request.setCardNumber("5448280000000007");
    	request.setExpirationMonth(12);
    	request.setExpirationYear(21);
    	request.setSecurityCode("235");
    	request.setKind(Kind.CREDIT);
    	
		TransactionResponse response = ac.authorize(request);
		String tid = response.getTid();
		String reference = response.getReference();

		RefundRequest refundRequest = new RefundRequest();
		refundRequest.setAmount(2000);
		RefundResponse refundResponse = ac.refund(tid, refundRequest);
		String refundId = refundResponse.getRefundId();

		Query query = new Query("10000205", "c222797e7101493fa9a92a7a555d206e", EnvironmentType.HOMOLOG);
		Gson gson = new Gson();

		// Query transaction by tid
		QueryTransactionResponse qryTranResponse = query.getTransactionByTid(tid);
		// System.out.println("============= Query Transaction TID =============");
		// System.out.println(gson.toJson(qryTranResponse));
		// System.out.println("============= Query Transaction TID =============");
		// System.out.println("");
		assertTrue(qryTranResponse.getReturnCode() == null || qryTranResponse.getReturnCode().isEmpty());

		// Query transaction by reference
		qryTranResponse = query.getTransactionByReference(reference);
		// System.out.println("============= Query Transaction Reference =============");
		// System.out.println(gson.toJson(qryTranResponse));
		// System.out.println("============= Query Transaction Reference =============");
		// System.out.println("");
		assertTrue(qryTranResponse.getReturnCode() == null || qryTranResponse.getReturnCode().isEmpty());

		// Query refunds
		RefundListResponse refundListResponse = query.getRefunds(tid);
		// System.out.println("============= Query Refund List =============");
		// System.out.println(gson.toJson(refundListResponse));
		// System.out.println("============= Query Refund List =============");
		// System.out.println("");
		assertTrue(refundListResponse.getReturnCode() == null || refundListResponse.getReturnCode().isEmpty());

		// Query refund
		refundResponse = query.getRefund(tid, refundId);
		// System.out.println("============= Query Refund =============");
		// System.out.println(gson.toJson(refundResponse));
		// System.out.println("============= Query Refund =============");
		// System.out.println("");
		assertTrue(refundResponse.getReturnCode() == null || refundResponse.getReturnCode().isEmpty());
	}
}
