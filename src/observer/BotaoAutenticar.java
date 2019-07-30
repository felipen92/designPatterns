package observer;

public class BotaoAutenticar implements EventosBotao {

	@Override
	public void botaoOk() {
		System.out.println("Autenticando...");
	}

	@Override
	public void botaoSair() {
		
	}

}
