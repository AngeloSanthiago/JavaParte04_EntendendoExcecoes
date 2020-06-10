package br.com.home;

// Se esta classe estender Exception, as classes que lançarem esta exceção terão que
//informar o lançamento de exceção na assinatura do método("throws", lança). A Classe se
//torna uma exceção "checked".

public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
