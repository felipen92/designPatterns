package factory.classe;

public class Main {

	public static void main(String[] args) {

		
		Moeda moeda1 = FabricaMoeda.getPais(Pais.BRASIL);
		Moeda moeda2 = FabricaMoeda.getPais(Pais.CANADA);
		Moeda moeda3 = FabricaMoeda.getPais(Pais.EUA);
		
		System.out.println(moeda1.getSimbolo());
		System.out.println(moeda2.getSimbolo());
		System.out.println(moeda3.getSimbolo());
	}

}
