package observer;

public class Main {
	
	public static void main(String[] args) {
		
		Botao botao = new Botao();
		botao.addEventos(new BotaoAutenticar());
		botao.addEventos(new BotaoLogar());
		
		botao.clicarOk();
		botao.clicarSair();
		
	}

}
