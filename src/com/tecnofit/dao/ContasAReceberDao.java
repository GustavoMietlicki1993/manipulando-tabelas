package com.tecnofit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tecnofit.model.backup.ContasAreceber;
import com.tecnofit.util.ConnectionFactory;

public class ContasAReceberDao {
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	
	ContasAreceber contasAReceber = null;
	public List<ContasAreceber> getContasAReceber() {
		List<ContasAreceber> listContasAReceber = new ArrayList<>();
		
		sql = "SELECT * FROM contas_a_receber";
		
		try {
			con = cf.conectarBackup();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				contasAReceber = new ContasAreceber();
				contasAReceber.setNumero(rs.getString(1));
				contasAReceber.setNome(rs.getString(2));
				//contasAReceber.setCpf(rs.getInt(3));
				contasAReceber.setBanco(rs.getString(4));
				contasAReceber.setFormaPagamento(rs.getString(5));
				contasAReceber.setDescricao(rs.getString(6));
				//contasAReceber.setDataDoVencimento(rs.getString(7));
				//contasAReceber.setDataDoRecebimento(rs.getString(8));
				//contasAReceber.setDataDoPagamento(rs.getString(9));
				contasAReceber.setValorBruto(rs.getString(10));
				contasAReceber.setTaxa(rs.getString(11));
				contasAReceber.setValorLiquido(rs.getString(12));
				contasAReceber.setCategoria(rs.getString(13));
				contasAReceber.setStatus(rs.getString(14));
				contasAReceber.setCodigoDeAutorizacao(rs.getString(15));
				listContasAReceber.add(contasAReceber);
			}
			
			return listContasAReceber;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			cf.desconectar();
		}
		
	}
	
	

}
