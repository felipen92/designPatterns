package strategy;

public class Normal implements Frete {

	@Override
	public double calcularFrete(double distancia) {
		return distancia * 1.25;
	}

}
