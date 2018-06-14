/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Enum UrlKind
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import com.google.gson.annotations.SerializedName;

/**
 * UrlKind enum.
 */
public enum UrlKind {
	NONE(0, "None"),
	
	@SerializedName("ThreeDSecureSuccess")
	THREE_D_SECURE_SUCCESS(1, "ThreeDSecureSuccess"),
	
	@SerializedName("ThreeDSecureFailure")
	THREE_D_SECURE_FAILURE(2, "ThreeDSecureFailure"),
	
	@SerializedName("Callback")
	CALLBACK(3, "Callback");
	
	int codigo;
	String nome;
	
	/**
	 * Set codigo.
	 * @param codigo
	 */
	UrlKind(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	/**
	 * Get Código.
	 * @return Código.
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Get Nome.
	 * @return Nome.
	 */
	public String getNome() {
		return nome;
	}
}
