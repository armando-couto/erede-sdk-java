package com.rede.adquirencia.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import com.google.gson.Gson;
import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.Kind;
import com.rede.adquirencia.sdk.model.RefundRequest;
import com.rede.adquirencia.sdk.model.RefundResponse;
import com.rede.adquirencia.sdk.model.TransactionRequest;
import com.rede.adquirencia.sdk.model.TransactionResponse;

public class RefundTest {

	@Test
	public void refund() {
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

		RefundRequest refundRequest = new RefundRequest();
		refundRequest.setAmount(2000);
		RefundResponse refundResponse = ac.refund(tid, refundRequest);
		// Gson gson = new Gson();
		// System.out.println("============= Refund =============");
		// System.out.println(gson.toJson(refundResponse));
		// System.out.println("============= Refund =============");
		// System.out.println("");
		
		assertEquals("359", refundResponse.getReturnCode());
	}

}
