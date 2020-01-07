package br.com.acc.lpoo;

/**
 * Hello world!
 *
 */
public class Cliente {
	public String Nome;
	int Codigo;
	public Cliente(String nome, int codigo) {
		super();
		Nome = nome;
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
 
}
