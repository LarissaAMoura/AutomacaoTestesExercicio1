package runner;


import cartaocredito.CartaoDeCredito;
import exercicios.Cliente;

public class Testes {
	private static Object codigo;
	private static Object nome;
	private static Object dataVal;
	private static Object numero;
	
	public static void main( String[] args )
	{
		Cliente cliente = new Cliente(codigo, nome);
		
		CartaoDeCredito cartaoCredito = new CartaoDeCredito(numero, dataVal);
		
		System.out.println("\n");
		System.out.println("- Próximo Cliente!!!");
	
	}

}
