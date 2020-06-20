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
//			Sempre executa ap�s o m�todo close()
			System.out.println(sdf.format(new Date()) + " - Deu erro na conex�o");
		}
	}

	private static void testaComandoFinallyComCatch() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println(sdf.format(new Date())+" - Deu erro na conex�o");
		} finally {
//			System.out.println(sdf.format(new Date())+" - Executando Finally");
			if (con != null) {
				con.fecha();
			}
		}
	}

	private static void testaComandoFinallySemCatch() {
		// O comando try sem catch n�o evita que uma exce��o lan�ada termine a execu��o abruptamente
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
			System.out.println("N�o deve mostrar essa linha");
		} finally {
			con.fecha();
		}
	}
}
