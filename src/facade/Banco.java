package facade;
import java.util.ArrayList;

class Banco {
	
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public Conta getCriarConta(Conta conta) {
		
		contas.add(conta);
		
		return conta;
	}
	
	public void excluirConta(int numeroConta) {
		
		for (Conta conta : contas) {
			if(numeroConta == conta.getNumeroConta()) {
				contas.remove(numeroConta);
			}
		}	
		
	}
	
	public Conta getBuscarConta(int numeroConta) {
		Conta achei = null;
		
		for (Conta conta : contas) {
			if(numeroConta == conta.getNumeroConta()) {
				achei = conta;
			}
		}
			return achei;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
}
