/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Enum Kind
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

import com.google.gson.annotations.SerializedName;

/**
 *  Kind enum.
 */
public enum Kind {
	@SerializedName("Unknown")
	UNKNOWN (0, "Unknown"),
	
	@SerializedName("Credit")
	CREDIT(1, "Credit"),
	
	@SerializedName("Debit")
	DEBIT(2, "Debit");
	
	int codigo;
	String nome; 
	
	/**
	 * Set Código.
	 * @param codigo
	 */
	Kind (int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	/**
	 * Get Codigo.
	 * @return Codigo.
	 */
	public int getCodigo(){
		return codigo;
	}
	
	/**
	 * Get Nome.
	 * @return Nome.
	 */
	public String getNome(){
		return nome;
	}
}
