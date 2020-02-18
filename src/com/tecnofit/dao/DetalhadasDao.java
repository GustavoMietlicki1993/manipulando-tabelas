package com.tecnofit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tecnofit.model.backup.Detalhadas;
import com.tecnofit.util.ConnectionFactory;

public class DetalhadasDao {
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	
	Detalhadas detalhadas = null;
	public List<Detalhadas> getDetalhadas() {
		List<Detalhadas> listDetalhadas = new ArrayList<>();
		
		sql = "SELECT * FROM detalhadas";
		
		try {
			con = cf.conectarBackup();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				detalhadas = new Detalhadas();
				detalhadas.setAtleta(rs.getString(1));
				detalhadas.setTipo(rs.getString(2));
				detalhadas.setAdesao(rs.getString(3));
				detalhadas.setRecorrencia(rs.getString(4));
				//detalhadas.setDataInicial(rs.getString(5));
				//detalhadas.setDataFinal(rs.getString(6));
				detalhadas.setValor(rs.getString(7));
				detalhadas.setRenovacaoAutomatica(rs.getString(8));
				detalhadas.setStatusDoUsuario(rs.getString(9));
				detalhadas.setStatusDoPlano(rs.getString(10));
				
				
				listDetalhadas.add(detalhadas);
			}
			
			return listDetalhadas;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			cf.desconectar();
		}
		
	}
	
	

}
