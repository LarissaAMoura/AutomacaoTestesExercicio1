package br.com.acc.lpoo;

import java.util.Date;

public class CartaoDeCredito {
	long numero;
	int dataDeValidade;
	Cliente donoDocartao;
	
	public CartaoDeCredito(long numero, int dataDeValidade,Cliente dono) {
		super();
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		this.donoDocartao = dono;
	}
	
}
