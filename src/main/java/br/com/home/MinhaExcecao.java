package br.com.home;

// Se esta classe estender Exception, os m�todos que lan�arem esta exce��o ter�o que
//informar o lan�amento de exce��o na assinatura do m�todo("throws", lan�a). A Classe se
//torna uma exce��o "checked".

// Classes do tipo RuntimeException s�o "uncheced"
public class MinhaExcecao extends RuntimeException {
//public class MinhaExcecao extends Exception {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
