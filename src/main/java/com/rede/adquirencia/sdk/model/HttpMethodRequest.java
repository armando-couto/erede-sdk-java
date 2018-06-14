/*
* Copyright 2017 Rede S.A.
* ***********************************************************
* Descrição: Enum HttpMethodRequest
* Autor : Diego Rodrigues
* Data : 26/07/2017
* Empresa : Iteris Consultoria e Software
* ***********************************************************
*/

package com.rede.adquirencia.sdk.model;

/**
 * HttpMethodRequest enum.
 */
public enum HttpMethodRequest {
	GET(1),
	POST(2),
	PUT(3),
	DELETE(4);
	
	int codigo;
	
	HttpMethodRequest(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
}
