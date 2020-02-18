package com.tecnofit.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tecnofit.model.db.table.ClienteVenda;
import com.tecnofit.model.db.table.Contrato;
import com.tecnofit.util.ConnectionFactory;

public class ContratoDao {
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	public void inserirContrato(Contrato contrato) {

		sql = "INSERT INTO contrato( nome, valor_padrao, numero_vigencia, tipo_vigencia, codigo_importacao) VALUES (?,?,?,?,?)";

		try {
			con = cf.conectarTeste();
			ps = con.prepareStatement(sql);
			ps.setString(1, contrato.getNome());
			ps.setString(2, contrato.getValorPadrao());
			ps.setString(3, contrato.getNumeroVigencia());
			ps.setString(4, contrato.getTipoVigencia());
			ps.setString(5, contrato.getCodigoImportacao());
			
			ps.execute();

			System.out.println("clienteContrato inserida DAO ");

		} catch (Exception e) {
			System.out.println("Erro ao inserir clienteVenda" + e);

		} finally {
			cf.desconectar();
		}

	}
	
	
	
	
	
	

}
