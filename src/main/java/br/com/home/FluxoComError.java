package br.com.home;

public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
//			Exce��es do tipo "checked" que o metodo1 pode lan�ar devem ser tratadas
//			no bloco catch, exce��es do tipo "unchecked" s�o opcionais.
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");

	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do m�todo1");
		metodo2();
		System.out.println("Fim do m�todo1");

	}

	private static void metodo2() {
		System.out.println("Inicio do m�todo2");
		metodo2();
		System.out.println("Fim do m�todo2");
	}
}
