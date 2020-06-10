package br.com.home;

public class Conta {
	void deposita() throws MinhaExcecao {
		System.out.println("inicio deposito");
		throw new MinhaExcecao("Falha no deposito");
	}
}
