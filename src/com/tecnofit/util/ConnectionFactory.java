package com.tecnofit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	Connection con;

	String url = "jdbc:mysql://localhost:3306/exam-backup";
	String BD_URL = "jdbc:mysql://localhost:3306/exam-backup?useTimezone=true&serverTimezone=UTC";
	String url2 = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC";
	String user = "root";
	String senha = "49501052836";

	public Connection conectarBackup() {

		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(BD_URL, user, senha);
				System.out.println("Conexão estabelecida CONNECTION FACTORY");
			} catch (Exception e) {
				System.out.println("ERRO NO CONNECTION FACTORY "+ e);
			}
		}

		return con;
	}
 
	public Connection conectarTeste() {

		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url2, user, senha);
				System.out.println("Conexão estabelecida CONNECTION FACTORY");
			} catch (Exception e) {
				System.out.println("ERRO NO CONNECTION FACTORY "+ e);
			}
			System.out.println("BANCO CONECTADO servlet");
		}

		return con;
	}

	
	public void desconectar() {
		if (con != null) {
			try {
				con.close();
				System.out.println("Conexao fechada");
			} catch (Exception e) {
				System.out.println("Impossivel finalizar conexao!");
			}
		}

	}
	
 }

