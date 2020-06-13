package br.com.home;

public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
//			Exceções do tipo "checked" que o metodo1 pode lançar devem ser tratadas
//			no bloco catch, exceções do tipo "unchecked" são opcionais.
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");

	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do método1");
		metodo2();
		System.out.println("Fim do método1");

	}

	private static void metodo2() {
		System.out.println("Inicio do método2");
		metodo2();
		System.out.println("Fim do método2");
	}
}
