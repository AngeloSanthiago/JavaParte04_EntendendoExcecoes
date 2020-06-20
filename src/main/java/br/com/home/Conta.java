package br.com.home;

public abstract class Conta {
	public double saldo;

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Numero da agencia invalida");
		}
		if (numero < 1) {
			throw new IllegalArgumentException("Número da conta invalida");
		}
	}

	void deposita() throws MinhaExcecao {
		System.out.println("inicio deposito");
		throw new MinhaExcecao("Falha no deposito");
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " - Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public abstract void deposita(double valor);

	public double getSaldo() {
		return this.saldo;
	}
}
