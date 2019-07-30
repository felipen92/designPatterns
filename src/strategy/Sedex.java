package strategy;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(double distancia) {
		return distancia * 1.45;
	}

}
