package br.com.acc.lpoo;

/**
 * Hello world!
 *
 */
public class Cliente {
	public String Nome;
	int Codigo;
	
	public Cliente(String Nome, int Codigo) {
		this.Nome = Nome;
		this.Codigo = Codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

 
}
