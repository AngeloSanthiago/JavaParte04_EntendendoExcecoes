package br.com.home;

// Se esta classe estender Exception, os métodos que lançarem esta exceção terão que
//informar o lançamento de exceção na assinatura do método("throws", lança). A Classe se
//torna uma exceção "checked".

// Classes do tipo RuntimeException são "uncheced"
public class MinhaExcecao extends RuntimeException {
//public class MinhaExcecao extends Exception {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
