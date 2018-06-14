package com.rede.adquirencia.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import com.google.gson.Gson;
import com.rede.adquirencia.sdk.model.EnvironmentType;
import com.rede.adquirencia.sdk.model.Kind;
import com.rede.adquirencia.sdk.model.TransactionRequest;
import com.rede.adquirencia.sdk.model.TransactionResponse;

public class CaptureTest {
	@Test
	public void capture(){
		Acquirer ac = new Acquirer("10000205", "c222797e7101493fa9a92a7a555d206e", EnvironmentType.HOMOLOG);

		TransactionRequest request = new TransactionRequest();
    	request.setCapture(false);
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

		request = new TransactionRequest();
		request.setAmount(2000);
		response = ac.capture(tid, request);
		// Gson gson = new Gson();
		// System.out.println("============= Capture =============");
		// System.out.println(gson.toJson(response));
		// System.out.println("============= Capture =============");
		// System.out.println("");
		
		assertEquals("00", response.getReturnCode());

	}
}
