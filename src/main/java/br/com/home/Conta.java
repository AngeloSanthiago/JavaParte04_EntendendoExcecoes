package br.com.home;

public abstract class Conta {
	public double saldo;

	public Conta(int agencia, int numero) {
		// TODO Auto-generated constructor stub
	}

	void deposita() throws MinhaExcecao {
		System.out.println("inicio deposito");
		throw new MinhaExcecao("Falha no deposito");
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " - Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public abstract void deposita(double valor);

	public double getSaldo() {
		return this.saldo;
	}
}
