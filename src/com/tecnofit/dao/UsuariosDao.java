package com.tecnofit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tecnofit.model.backup.Usuarios;
import com.tecnofit.util.ConnectionFactory;

public class UsuariosDao {
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	
	Usuarios usuarios = null;
	public List<Usuarios> getUsuarios() {
		List<Usuarios> listUsuarios = new ArrayList<>();
		
		sql = "SELECT * FROM usuarios";
		
		try {
			con = cf.conectarBackup();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				usuarios = new Usuarios();
				usuarios.setNome(rs.getString(1));
				usuarios.setEmail(rs.getString(2));
				usuarios.setTelefone(rs.getString(3));
				usuarios.setDataDeAniversario(rs.getString(4));
				usuarios.setIdade(rs.getString(5));
				usuarios.setCpf(rs.getString(6));
				usuarios.setRg(rs.getString(7));
				usuarios.setSexo(rs.getString(8));
				usuarios.setPeso(rs.getString(9));
				usuarios.setEndereco(rs.getString(10));
				usuarios.setNumero(rs.getString(11));
				usuarios.setCidade(rs.getString(12));
				usuarios.setBairro(rs.getString(13));
				usuarios.setEstado(rs.getString(14));
				usuarios.setPais(rs.getString(15));	
				usuarios.setCep(rs.getString(16));
				usuarios.setCategoria(rs.getString(17));
				usuarios.setStatus(rs.getString(18));
				usuarios.setCriadoEm(rs.getString(19));
				
				listUsuarios.add(usuarios);
			}
			
			return listUsuarios;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			cf.desconectar();
		}
		
	}
	
	

}
