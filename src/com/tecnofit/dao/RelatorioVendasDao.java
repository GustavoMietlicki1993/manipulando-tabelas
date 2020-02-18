package com.tecnofit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tecnofit.model.backup.RelatorioVendas;
import com.tecnofit.util.ConnectionFactory;

public class RelatorioVendasDao{
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	
	RelatorioVendas relatorioVendas = null;
	public List<RelatorioVendas> getRelatorioVendas() {
		List<RelatorioVendas> listRelatorioVendas = new ArrayList<>();
		
		sql = "SELECT * FROM relatorio_vendas";
		
		try {
			con = cf.conectarBackup();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				relatorioVendas = new RelatorioVendas();
				relatorioVendas.setCodigoDaVenda(rs.getString(1));
				//relatorioVendas.setDataDaVenda(rs.getString(2));
				relatorioVendas.setCliente(rs.getString(3));
				relatorioVendas.setValorBruto(rs.getDouble(4));
				relatorioVendas.setDesconto(rs.getString(5));
				relatorioVendas.setValorTotal(rs.getString(6));
				relatorioVendas.setStatus(rs.getString(7));
				
				listRelatorioVendas.add (relatorioVendas);
			}
			
			return listRelatorioVendas;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null; 
		}finally {
			cf.desconectar();
		}
		
	}
	
	

}
