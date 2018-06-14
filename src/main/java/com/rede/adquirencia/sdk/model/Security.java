/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Classe Security
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * Security class.
 */
public class Security {
	String affiliation;
	String token;
	EnvironmentType environment;

	public Security(String affiliation, String token, EnvironmentType environment) {
		this.affiliation = affiliation;
		this.token = token;
		this.environment = environment;
	}
	
	/**
	 * Get affiliation property.
	 * @return affiliation.
	 */
	public String getAffiliation() {
		return affiliation;
	}
	
	/**
	 * Set affiliation property.
	 * @param affiliation
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	
	/**
	 * Get token property.
	 * @return token.
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Set token property.
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * Get environment property.
	 * @return environment.
	 */
	public EnvironmentType getEnvironment() {
		return environment;
	}
	
	/**
	 * Set environment property.
	 * @param environment
	 */
	public void setEnvironment(EnvironmentType environment) {
		this.environment = environment;
	}
}
