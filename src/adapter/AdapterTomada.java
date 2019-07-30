package adapter;

public class AdapterTomada extends TomadaDeDoisPinos {

	private TomadaDeTresPinos tomadaDeTresPinos;
	
	public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
		super();
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}

	public void ligarNaTomada() {
		tomadaDeTresPinos.ligarNaTomada();
	}
}
