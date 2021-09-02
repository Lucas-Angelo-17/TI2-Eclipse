package teste;

import java.util.*;

public class SomaDoisnumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		//Declaração de variaveis.
		int num1, num2, num3;
		
		//Leitura
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		//Somar
		int soma;
		soma = num1 + num2;
		
		//Saída
		System.out.println("A soma dos dois é igual a: " + soma);
	}
}
