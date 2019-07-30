package factory.enums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escolha o Pa�s (1) Brasil, (2) EUA, (3) Canad�");
		int opcao = teclado.nextInt();
		Pais pais = Pais.values()[opcao - 1];
		
		Moeda moeda = pais.getPais();
		System.out.println(moeda.getSimbolo());
		teclado.close();
		
		
	
	}

}
