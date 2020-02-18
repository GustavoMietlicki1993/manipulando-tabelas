package com.tecnofit.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tecnofit.model.db.table.ClienteContrato;
import com.tecnofit.model.db.table.ClienteVenda;
import com.tecnofit.util.ConnectionFactory;

public class ClienteVendaDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	public void inserirClienteVenda(ClienteVenda clienteVenda) {

		sql = "INSERT INTO cliente_venda (cliente_id, valor, valor_desconto, valor_aberto, data_venda, codigo_importacao) VALUES (?,?,?,?,?,?)";

		try {
			con = cf.conectarTeste();
			ps = con.prepareStatement(sql);

			ps.setString(1, clienteVenda.getClienteId());
			ps.setString(2, clienteVenda.getValor());
			ps.setString(3, clienteVenda.getValorDesconto());
			ps.setDouble(4, clienteVenda.getValorAberto());
			//ps.setString(5, clienteVenda.getDataVenda());
			//ps.setString(6, clienteVenda.getCodigoImportacao());

			ps.execute();

			System.out.println("clienteContrato inserida DAO ");

		} catch (Exception e) {
			System.out.println("Erro ao inserir clienteVenda" + e);

		}finally {
			cf.desconectar();
		}


	}

	
	
	
	
	

}
