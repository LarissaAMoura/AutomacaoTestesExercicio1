package br.com.acc.lpoo;

public class Testes {
	public static void main( String[] args )
	{
		//criando clientes
		Cliente ana =new Cliente("Ana Leopoudina da Silva",0102);
		Cliente joao =new Cliente("João da silva sauro", 1111);
		//criando cartoes
		CartaoDeCredito hiper =new CartaoDeCredito(1234 ,0622,ana);
		CartaoDeCredito nu =new CartaoDeCredito(4321,0622,joao);

		//Imprimindo valores
		System.out.println(" O numero do hiper antigo do cartão é: "+hiper.getNumero());
		hiper.setNumero(555);
		System.out.println(" O numero do atual do cartão é: "+hiper.getNumero());
		System.out.println(" A data de validade do cartão hiper é: "+hiper.getDataDeValidade());
		System.out.println(" O dono do cartão é: "+hiper.getDonoDocartao().getNome());

	}

}
