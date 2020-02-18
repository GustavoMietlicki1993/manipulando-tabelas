package com.tecnofit.main;

import java.util.ArrayList;
import java.util.List;

import com.tecnofit.dao.ContasAReceberDao;
import com.tecnofit.dao.DetalhadasDao;
import com.tecnofit.dao.RelatorioVendasDao;
import com.tecnofit.dao.UsuariosDao;
import com.tecnofit.db.dao.ClienteContratoDao;
import com.tecnofit.db.dao.ClienteDao;
import com.tecnofit.db.dao.ClienteVendaDao;
import com.tecnofit.db.dao.ContratoDao;
import com.tecnofit.db.dao.LancamentosDao;
import com.tecnofit.model.backup.ContasAreceber;
import com.tecnofit.model.backup.Detalhadas;
import com.tecnofit.model.backup.RelatorioVendas;
import com.tecnofit.model.backup.Usuarios;
import com.tecnofit.model.db.table.Cliente;
import com.tecnofit.model.db.table.ClienteContrato;
import com.tecnofit.model.db.table.ClienteVenda;
import com.tecnofit.model.db.table.Contrato;
import com.tecnofit.model.db.table.Lancamentos;

public class Main {

	

	public static void main(String[] args) {
		
		System.out.println("CONTAS A RECEBER'...");
		
		ContasAReceberDao contasAReceberDao = new ContasAReceberDao();
		List<ContasAreceber>listContasAreceber = new ArrayList<>();		
		listContasAreceber = contasAReceberDao.getContasAReceber();
		System.out.println("FIM DA EXECUCAO 'CONTAS A RECEBER'.");
		
		
		System.out.println("INICIANDO ARMAZENAMENTO DA LISTA 'DETALHADAS'...");
		DetalhadasDao detalhadasDao = new DetalhadasDao();
		List<Detalhadas>listDetalhadas = new ArrayList<>();		
		listDetalhadas = detalhadasDao.getDetalhadas();
		System.out.println("FIM DA EXECUCAO 'DETALHADAS'.");
		
		
		System.out.println("INICIANDO ARMAZENAMENTO DA LISTA 'RELATORIO VENDAS'...");
		RelatorioVendasDao relatorioVendasDao = new RelatorioVendasDao();
		List<RelatorioVendas>listRelatorioVendas = new ArrayList<>();		
		listRelatorioVendas = relatorioVendasDao.getRelatorioVendas();
		System.out.println("FIM DA EXECUCAO 'RELATORIO VENDAS'.");
		
		
		System.out.println("INICIANDO ARMAZENAMENTO DA LISTA 'USUARIOS'...");
		UsuariosDao usuariosDao = new UsuariosDao();
		List<Usuarios>ListUsuarios= new ArrayList<>();		
		ListUsuarios = usuariosDao.getUsuarios();
		System.out.println("FIM DA EXECUCAO 'USUARIOS'.");
		
		Cliente cliente = new Cliente();
		
		for (int i = 0; i < ListUsuarios.size();i++){		    
		    cliente.setNome(ListUsuarios.get(i).getNome());
		    cliente.setEmail(ListUsuarios.get(i).getEmail());
		    cliente.setCpf(ListUsuarios.get(i).getCpf());
		    
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.inserirCliente(cliente);
		    
		}
	
		
		ClienteContrato clienteContrato = new ClienteContrato();
		
		for( int i=0 ; i < listRelatorioVendas.size();i++){
			
				
				clienteContrato.setValorDoContrato(listRelatorioVendas.get(i).getValorBruto());
				//clienteContrato.setDataInicio(listDetalhadas.get(j).getDataInicial());
				//clienteContrato.setDataVencimento(listDetalhadas.get(j).getDataFinal());
				clienteContrato.setClienteVendaId(listRelatorioVendas.get(i).getCodigoDaVenda());					
				clienteContrato.setContratoId(listRelatorioVendas.get(i).getCodigoDaVenda());
				
				ClienteContratoDao clienteContratoDao = new ClienteContratoDao();
				clienteContratoDao.inserirClienteContrato(clienteContrato);
		
		}
		
		ClienteVenda clienteVenda = new ClienteVenda();		
	
		
		for(int i=0;i<listRelatorioVendas.size() ;i++){
			
				
				clienteVenda.setClienteId(listRelatorioVendas.get(i).getCliente());
				clienteVenda.setValor(listRelatorioVendas.get(i).getValorTotal());
				clienteVenda.setValorDesconto(listRelatorioVendas.get(i).getDesconto());
				clienteVenda.setValorAberto(listRelatorioVendas.get(i).getValorBruto());
				//clienteVenda.setDataVenda(listRelatorioVendas.get(i).getDataDaVenda());
				clienteVenda.setCodigoImportacao(listRelatorioVendas.get(i).getStatus());
				
				ClienteVendaDao clienteVendaDao = new ClienteVendaDao();
				clienteVendaDao.inserirClienteVenda (clienteVenda);
		}
		
		Contrato contrato = new Contrato();
		
		
		for(int i=0;i<listDetalhadas.size();i++){
			for(int j=0;j<ListUsuarios.size();j++) {
				
				contrato.setNome(ListUsuarios.get(j).getNome());
				contrato.setValorPadrao(listDetalhadas.get(i).getValor());
				contrato.setNumeroVigencia(listDetalhadas.get(i).getStatusDoPlano());
				contrato.setTipoVigencia(listDetalhadas.get(i).getRenovacaoAutomatica());
				contrato.setCodigoImportacao(listContasAreceber.get(i).getCodigoDeAutorizacao());
				
				ContratoDao contratoDao = new ContratoDao();
				contratoDao.inserirContrato (contrato);
						
			}
		}
		
		Lancamentos lancamentos = new Lancamentos();
		
		
		for(int i=0;i<listContasAreceber.size() ;i++){
			for(int j=0;j<listRelatorioVendas.size();j++) {
			
				lancamentos.setTipoRecebimento(listContasAreceber.get(i).getFormaPagamento());
				lancamentos.setValor(listRelatorioVendas.get(j).getValorBruto());
				lancamentos.setValorDesconto(listRelatorioVendas.get(j).getDesconto());
				//lancamentos.setDataLancamento(listContasAreceber.get(i).getDataDoPagamento());
				//lancamentos.setDataRecebimento(listContasAreceber.get(i).getDataDoRecebimento());
				//lancamentos.setDataVencimento(listContasAreceber.get(i).getDataDoVencimento());
				//lancamentos.setTotalParcelas(listContasAreceber.get(i).getValorBruto());
				lancamentos.setParcelaAtual(listContasAreceber.get(i).getValorLiquido());
				lancamentos.setClienteVendaId(listRelatorioVendas.get(j).getCodigoDaVenda());
				
				LancamentosDao lancamentosDao = new LancamentosDao();
				lancamentosDao.inserirLancamentos (lancamentos);
			}
		}
		
		
		
		
	}		
}


