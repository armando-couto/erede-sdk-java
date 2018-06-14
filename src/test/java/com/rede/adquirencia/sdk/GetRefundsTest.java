package com.rede.adquirencia.sdk;

import org.junit.Test;

import com.rede.adquirencia.sdk.model.EnvironmentType;

public class GetRefundsTest {
	@Test
	public void getRefunds(){
		Query ac = new Query("37502603", "4B56E46EE155CA2A0AC0241C69A1E949F964BB26", EnvironmentType.PRODUCTION);
		ac.getRefunds("8397537906055735840");
	}
}
