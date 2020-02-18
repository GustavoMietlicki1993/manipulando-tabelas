package com.tecnofit.model.db.table;

public class ClienteVenda {
	
	private String id; 
	private String clienteId;
	private String valor;
	private String valorDesconto; 
	private Double valorAberto;
	//private String dataVenda;
	private String codigoImportacao;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public Double getValorAberto() {
		return valorAberto;
	}
	public void setValorAberto(Double valorAberto) {
		this.valorAberto = valorAberto;
	}
	//public String getDataVenda() {
	//	return dataVenda;
	//}
	//public void setDataVenda(String dataVenda) {
	//	this.dataVenda = dataVenda;
	//}
	//public String getCodigoImportacao() {
	//	return codigoImportacao;
	//}
	public void setCodigoImportacao(String codigoImportacao) {
		this.codigoImportacao = codigoImportacao;
	}
	
	
}
