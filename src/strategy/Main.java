package strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a ditancia: ");
		double distancia = teclado.nextDouble();
		
		System.out.print("Qual tipo de frete (1) Nomal, (2) Sedex: ");
		int opcaoFrete = teclado.nextInt();
		TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
		
		
		Frete frete = tipoFrete.obterFrete();
		double preco = frete.calcularFrete(distancia);
		System.out.print("O valor total é de R$" + preco);
		teclado.close();
	}
}
