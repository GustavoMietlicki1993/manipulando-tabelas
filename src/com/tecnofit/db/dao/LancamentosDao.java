package com.tecnofit.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tecnofit.model.db.table.ClienteVenda;
import com.tecnofit.model.db.table.Lancamentos;
import com.tecnofit.util.ConnectionFactory;

public class LancamentosDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	ConnectionFactory cf = new ConnectionFactory();
	String sql = null;
	
	public void inserirLancamentos(Lancamentos lancamentos) {

		sql = "INSERT INTO lancamentos (tipo_recebimento, valor, valor_desconto, data_lancamento, data_recebimento, data_vencimento, total_parcelas, parcela_atual, cliente_venda_id) VALUES (?,?,?,?,?,?,?,?,?)";

		try {
			con = cf.conectarTeste();
			ps = con.prepareStatement(sql);
			ps.setString(1, lancamentos.getTipoRecebimento());
			ps.setDouble(2, lancamentos.getValor());
			ps.setString(3, lancamentos.getValorDesconto());
			//ps.setString(4, lancamentos.getDataLancamento());
			//ps.setString(5, lancamentos.getDataRecebimento());
			//ps.setString(6, lancamentos.getDataVencimento());
			ps.setString(7, lancamentos.getTotalParcelas());
			ps.setString(8, lancamentos.getParcelaAtual());
			ps.setString(9, lancamentos.getClienteVendaId());

			ps.execute();

			System.out.println("clienteContrato inserida DAO ");

		} catch (Exception e) {
			System.out.println("Erro ao inserir clienteVenda" + e);

		} finally {
			cf.desconectar();
		}

	}
	
	
	
	

}
