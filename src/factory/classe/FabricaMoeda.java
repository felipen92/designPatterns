package factory.classe;

public class FabricaMoeda {

	public static Moeda getPais(Pais pais) {

		if (pais.equals(Pais.BRASIL)) {
			return new Real();
		} else if (pais.equals(Pais.EUA)) {
			return new Dolar();
		} else if (pais.equals(Pais.CANADA)) {
			return new DolarCanadense();
		}
		throw new IllegalArgumentException("Não existe esse País");

	}
}
