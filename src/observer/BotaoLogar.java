package observer;

public class BotaoLogar implements EventosBotao {

	@Override
	public void botaoOk() {
		System.out.println("Entrando...");
	}

	@Override
	public void botaoSair() {
		System.out.println("Sair...");
	}

}
