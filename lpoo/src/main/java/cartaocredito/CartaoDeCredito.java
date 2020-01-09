package cartaocredito;

import java.util.Scanner;

public class CartaoDeCredito {
	public CartaoDeCredito (Object numero, Object dataVal) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, informe os últimos 4 números do seu Cartão de Créditos: ");
		String Numero = scan.next();

		System.out.println("Por fim, informe a data de validade do Cartão: ");
		String DataVal = scan.next();
		
		System.out.println("Obrigado senhor(a)! Dados apresentados: Cartão final: " + Numero + " Válido até: " + DataVal + " está ok!");
		
	}
	
	
	
}
