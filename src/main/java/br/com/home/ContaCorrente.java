package br.com.home;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

}
