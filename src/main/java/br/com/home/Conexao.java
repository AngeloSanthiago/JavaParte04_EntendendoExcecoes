package br.com.home;

public class Conexao {
	public Conexao() {
		System.out.println("Abrindo conexão");
	}
	public void leDados() {
		System.out.println("Recebe dados");
		throw new IllegalStateException();
	}
	public void fecha() {
		System.out.println("Fechando conexao");
	}
}
