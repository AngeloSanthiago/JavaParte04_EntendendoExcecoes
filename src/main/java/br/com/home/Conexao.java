package br.com.home;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexão");
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
	 * O método "close()" só será executado se a instanciação dessa classe não for nulla. 
	 */
	@Override
	public void close() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date())+" - Fechando conexao pelo método close");
	}
}
