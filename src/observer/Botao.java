package observer;

import java.util.ArrayList;

public class Botao {

	private ArrayList<EventosBotao> eventos = new ArrayList<>();
	
	public void addEventos(EventosBotao evento) {
		
		eventos.add(evento);
	}
	
	public void clicarOk() {
		for (EventosBotao eventosBotao : eventos) {
			eventosBotao.botaoOk();
		}
	}
	
	public void clicarSair() {
		for (EventosBotao eventosBotao : eventos) {
			eventosBotao.botaoSair();
		}
	}
}
