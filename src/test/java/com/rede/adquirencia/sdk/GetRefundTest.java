package com.rede.adquirencia.sdk;

import org.junit.Test;

import com.rede.adquirencia.sdk.model.EnvironmentType;

public class GetRefundTest {
	@Test
	public void getRefund(){
		Query ac = new Query("37502603", "4B56E46EE155CA2A0AC0241C69A1E949F964BB26", EnvironmentType.PRODUCTION);
		ac.getRefund("8397537906055735840", "16e4334d-ca8f-4863-9009-47b469d7aeb9");
	}
}
