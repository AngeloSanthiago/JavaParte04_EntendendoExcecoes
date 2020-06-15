package br.com.home;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
//		conta.saca(190.0); //permite saque sem lan�ar exce��o
		try {
			conta.saca(210.0); //Lan�a exce��o checked agora
		} catch (SaldoInsuficienteException e) {
			System.out.println("Exce��o: "+e.getMessage());
		}
		System.out.println("Saldo Atual: "+conta.getSaldo());
	}

}
