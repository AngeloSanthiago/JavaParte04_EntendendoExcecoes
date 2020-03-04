package br.com.home;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Excess�o: " + msg);
			ex.printStackTrace(); // A impress�o das mensagem em vermelho da pilha de excessao as vezes aparece por �ltimo no log de execu��o
		}
		System.out.println("Fim do main");
	}

	public static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	public static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio do metodo2");
		boolean lancaExcecao = true; // Para compilar o ultimo comando
		if (lancaExcecao) {
			throw new MinhaExcecao("Lan�ando minha excessao");
		}
		System.out.println("Fim do metodo2");
	}
}
