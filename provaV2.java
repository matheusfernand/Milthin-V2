package V2;

import java.util.Scanner;

public class provaV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Pega a base de entrada
		System.out.println("Selecione uma base de entrada: ");
		System.out.println("1 - Hexadecimal");
		System.out.println("2 - Decimal");
		System.out.println("3 - Octal");
		System.out.println("4 - Bin�rio");
		int entrada = sc.nextInt();

		if (entrada < 1 || entrada > 4) {
			System.out.println("Op��o inv�lida");
			return;
		}
		//Pede o n�mero ao usu�rio
		System.out.println("Digite um n�mero para ser convertido:");
		int numeroEntrada = sc.nextInt();
		
		//Converte o n�mero para a base de entrada
		switch (entrada) {

		case 1: {
			String resultado = Integer.toHexString(numeroEntrada);
			System.out.println("(H) -> " + resultado);
			break;
		}
		case 2: {
			String binario = Integer.toBinaryString(numeroEntrada);
			int resultado = Integer.parseInt(binario, 2);
			System.out.println("(D) -> " + resultado);
			break;
		}
		case 3: {
			String resultado = Integer.toOctalString(numeroEntrada);
			System.out.println("(O) -> " + resultado);
			break;
		}
		case 4: {
			String resultado = Integer.toBinaryString(numeroEntrada);
			System.out.println("(B) -> " + resultado);
			break;
		}

		}
		//Pega a base de saida
		System.out.println("Selecione uma base de sa�da: ");
		System.out.println("1 - Hexadecimal");
		System.out.println("2 - Decimal");
		System.out.println("3 - Octal");
		System.out.println("4 - Bin�rio");
		int saida = sc.nextInt();

		if (saida < 1 || saida > 4) {
			System.out.println("Op��o inv�lida");
			return;
		}
		//Converte o n�mero para a base de saida
		switch (saida) {

		case 1: {
			String resultado = Integer.toHexString(numeroEntrada);
			System.out.println("(H) -> " + resultado);
			break;
		}
		case 2: {
			String binario = Integer.toBinaryString(numeroEntrada);
			int resultado = Integer.parseInt(binario, 2);
			System.out.println("(D) -> " + resultado);
			break;
		}
		case 3: {
			String resultado = Integer.toOctalString(numeroEntrada);
			System.out.println("(O) -> " + resultado);
			break;
		}
		case 4: {
			String resultado = Integer.toBinaryString(numeroEntrada);
			System.out.println("(B) -> " + resultado);
			break;
		}
		}
	}
}