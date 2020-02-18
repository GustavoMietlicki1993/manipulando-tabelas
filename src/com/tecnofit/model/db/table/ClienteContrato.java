package com.tecnofit.model.db.table;

public class ClienteContrato {
	
	private String id;
	private Double valorDoContrato;
	private String dataInicio;
	private String dataVencimento;
	private String clienteVendaId;
	private String contratoId;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getValorDoContrato() {
		return valorDoContrato;
	}
	public void setValorDoContrato(Double valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getClienteVendaId() {
		return clienteVendaId;
	}
	public void setClienteVendaId(String ClienteVendaId) {
		this.clienteVendaId = ClienteVendaId;
	}
	public String getContratoId() {
		return contratoId;
	}
	public void setContratoId(String contratoId) {
		this.contratoId = contratoId;
	}
	
	
	
}
