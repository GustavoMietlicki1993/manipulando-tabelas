package com.tecnofit.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.GregorianCalendar;

import com.tecnofit.model.db.table.ClienteContrato;
import com.tecnofit.util.ConnectionFactory;

public class ClienteContratoDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	
	public void inserirClienteContrato(ClienteContrato clienteContrato) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.getTime();
		
		GregorianCalendar calendarA = new GregorianCalendar();
		calendarA.getTime();

		sql = "INSERT INTO cliente_contrato (valor_contrato, data_inicio, data_vencimento, cliente_venda_id, contrato_id) VALUES (?, SYSDATE, SYSDATE,?,?)";

		try {
			con = cf.conectarTeste();
			ps = con.prepareStatement(sql);
			ps.setDouble(1, clienteContrato.getValorDoContrato());
			ps.setDate(2, (Date) calendar.getTime());
			ps.setDate(3, (Date) calendarA.getTime());
			ps.setString(4, clienteContrato.getClienteVendaId());
			ps.setString(5, clienteContrato.getContratoId());

			ps.execute();

			System.out.println("clienteContrato inserida DAO ");

		} catch (Exception e) {
			System.out.println("Erro ao inserir clienteContrato" + e);

		} finally {
			cf.desconectar();
		}

	}


	
	
	
}
