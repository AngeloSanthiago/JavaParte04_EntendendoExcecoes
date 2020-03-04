package br.com.home;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Excessão: " + msg);
			ex.printStackTrace(); // A impressão das mensagem em vermelho da pilha de excessao as vezes aparece por último no log de execução
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
			throw new MinhaExcecao("Lançando minha excessao");
		}
		System.out.println("Fim do metodo2");
	}
}
