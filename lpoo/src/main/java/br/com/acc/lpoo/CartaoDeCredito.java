package br.com.acc.lpoo;

import java.util.Date;

public class CartaoDeCredito {
	private long numero;
	private int dataDeValidade;
	private Cliente donoDocartao;
	
	public CartaoDeCredito(long numero, int dataDeValidade,Cliente dono) {
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		this.donoDocartao = dono;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(int dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Cliente getDonoDocartao() {
		return donoDocartao;
	}

	public void setDonoDocartao(Cliente donoDocartao) {
		this.donoDocartao = donoDocartao;
	}
	
	
	
}
