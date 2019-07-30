package facade;

class Conta {

	private double saldo;

	private String titular;

	private int numeroConta;

	private int agencia;

	public Conta(double saldo, String titular, int numeroConta, int agencia) {
		this.saldo = saldo;
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}

	public void depositar(double montante) {

		if (montante >= 0) {
			saldo += montante;
		}

	}

	public void sacar(double montante) {

		if (montante >= 0) {
			saldo -= montante;
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}
