package br.com.home;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		try {
			conta.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("tratamento......");
		}
	}
}
