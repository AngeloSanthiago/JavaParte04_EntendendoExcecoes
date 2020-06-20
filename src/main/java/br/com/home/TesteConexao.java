package br.com.home;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import sun.util.resources.CalendarData;

public class TesteConexao {

	public static void main(String[] args) {
		testaComandoTryWithResources_Statement();
//		testaComandoFinallyComCatch();
//		testaComandoFinallySemCatch();
	}

	private static void testaComandoTryWithResources_Statement() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
//		Comando "try-with-resources"
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException e) {
//			Sempre executa após o método close()
			System.out.println(sdf.format(new Date()) + " - Deu erro na conexão");
		}
	}

	private static void testaComandoFinallyComCatch() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println(sdf.format(new Date())+" - Deu erro na conexão");
		} finally {
//			System.out.println(sdf.format(new Date())+" - Executando Finally");
			if (con != null) {
				con.fecha();
			}
		}
	}

	private static void testaComandoFinallySemCatch() {
		// O comando try sem catch não evita que uma exceção lançada termine a execução abruptamente
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
			System.out.println("Não deve mostrar essa linha");
		} finally {
			con.fecha();
		}
	}
}
