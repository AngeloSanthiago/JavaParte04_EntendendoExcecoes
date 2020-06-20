package br.com.home;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conex�o");
//		throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("Recebe dados");
		throw new IllegalStateException();
	}

	public void fecha() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date())+" - Fechando conexao pelo metodo fecha");
	}
	/**
	 * O m�todo "close()" s� ser� executado se a instancia��o dessa classe n�o for nulla. 
	 */
	@Override
	public void close() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date())+" - Fechando conexao pelo m�todo close");
	}
}
