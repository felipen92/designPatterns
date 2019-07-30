package facade;

public class TAAFacade {
	
	private Banco banco;
	
	public TAAFacade() {
		banco = new Banco();
	}
	
	public Conta getCriarConta(Conta conta) {
		banco.getCriarConta(conta);
		return conta;
	}
	
	public void excluirConta(int numeroConta) {
		banco.excluirConta(numeroConta);
		
	}
	
	public void depositar(int numeroConta, double montante) {
		Conta conta = banco.getBuscarConta(numeroConta);
		
		if(conta != null) {
			conta.depositar(montante);
		}
	}
	
	public void sacar(int numeroConta, double montante) {
		Conta conta = banco.getBuscarConta(numeroConta);
		
		if(conta != null) {
			conta.sacar(montante);
		}
		
		
	}

}
