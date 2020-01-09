package exercicios;

import java.util.Scanner;

public class Cliente  {

	public Cliente(Object codigo, Object nome){

		Scanner scan = new Scanner(System.in);

		System.out.println("Por favor, informe seu Código (com até 3 dígitos): ");
		int Codigo = scan.nextInt();

		System.out.println("Por favor, informe seu Primeiro nome:");
		String Nome = scan.next();

	}

}
