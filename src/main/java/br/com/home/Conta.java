package br.com.home;

public abstract class Conta {
	private double saldo;
	void deposita() throws MinhaExcecao {
		System.out.println("inicio deposito");
		throw new MinhaExcecao("Falha no deposito");
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	public abstract void deposita(double valor);
}
