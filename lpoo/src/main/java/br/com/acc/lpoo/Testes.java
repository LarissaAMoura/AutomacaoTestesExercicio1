package br.com.acc.lpoo;

public class Testes {
	   public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        Cliente ana =new Cliente("Ana Leopoudina da Silva",000000);
	    	Cliente joao =new Cliente("João da silva sauro", 11111111);
	    	CartaoDeCredito hiper =new CartaoDeCredito(1234 ,0622,ana);
	    	CartaoDeCredito nu =new CartaoDeCredito(4321,0622,joao);
	        
	    	System.out.println(" O numero  antigo do cartão é: "+hiper.numero);
	    	hiper.numero= 555;
	    	System.out.println(" O numero atual do cartão é: "+hiper.numero);
	    	System.out.println(" A data de validade do cartão é: "+hiper.dataDeValidade);
	    	System.out.println(" O dono do cartão é: "+hiper.donoDocartao.getNome());
	   
	    }

}
