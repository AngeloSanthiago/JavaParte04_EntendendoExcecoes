package br.com.home;

// Se esta classe estender Exception, as classes que lan�arem esta exce��o ter�o que
//informar o lan�amento de exce��o na assinatura do m�todo("throws", lan�a). A Classe se
//torna uma exce��o "checked".

public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
