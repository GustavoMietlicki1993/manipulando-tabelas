package com.tecnofit.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tecnofit.model.db.table.Cliente;
import com.tecnofit.model.db.table.ClienteContrato;
import com.tecnofit.util.ConnectionFactory;

public class ClienteDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	public void inserirCliente(Cliente cliente) {

		sql = "INSERT INTO cliente(nome,email,cpf, codigo_importacao) VALUES (?,?,?,?)";

		try {
			con = cf.conectarTeste();
			ps = con.prepareStatement(sql);
			
			
			
		

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEmail());
			ps.setString(3, cliente.getCpf());
			ps.setString(4, cliente.getCodigoImportacao());

			ps.execute();

			System.out.println("clienteContrato inserida DAO ");

		} catch (Exception e) {
			System.out.println("Erro ao inserir clienteContrato" + e);

		} finally {
			cf.desconectar();
		}

	}

	
	
	
	
	
	
	

}
