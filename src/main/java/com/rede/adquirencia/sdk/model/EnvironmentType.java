/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Enum EnvironmentType
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * EnvironmentType enum. 
 */
public enum EnvironmentType {
	HOMOLOG(0),
	PRODUCTION(1);
	
	int codigo;
	
	EnvironmentType(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
}
