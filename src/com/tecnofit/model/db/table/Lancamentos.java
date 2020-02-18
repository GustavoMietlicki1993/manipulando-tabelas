package com.tecnofit.model.db.table;

public class Lancamentos {

	private int id;
	private String tipoRecebimento;
	private Double valor;
	private String valorDesconto;
	//private String dataLancamento;
	//private String dataRecebimento;
	//private String dataVencimento;
	private String totalParcelas;
	private String parcelaAtual;
	private String clienteVendaId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoRecebimento() {
		return tipoRecebimento;
	}
	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	//public String getDataLancamento() {
	//	return dataLancamento;
	//}
	//public void setDataLancamento(String dataLancamento) {
	//	this.dataLancamento = dataLancamento;
	//}
	//public String getDataRecebimento() {
	//	return dataRecebimento;
	//}
	//public void setDataRecebimento(String dataRecebimento) {
	//	this.dataRecebimento = dataRecebimento;
	//}
	//public String getDataVencimento() {
	//	return dataVencimento;
	//}
	//public void setDataVencimento(String dataVencimento) {
	//	this.dataVencimento = dataVencimento;
	//}
	public String getTotalParcelas() {
		return totalParcelas;
	}
	public void setTotalParcelas(String totalParcelas) {
		this.totalParcelas = totalParcelas;
	}
	public String getParcelaAtual() {
		return parcelaAtual;
	}
	public void setParcelaAtual(String parcelaAtual) {
		this.parcelaAtual = parcelaAtual;
	}
	public String getClienteVendaId() {
		return clienteVendaId;
	}
	public void setClienteVendaId(String clienteVendaId) {
		this.clienteVendaId = clienteVendaId;
	}
	
	
	
	
}
