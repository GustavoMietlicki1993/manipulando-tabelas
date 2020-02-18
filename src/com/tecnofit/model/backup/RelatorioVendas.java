package com.tecnofit.model.backup;

public class RelatorioVendas {

	private String CodigoDaVenda;
	//private String dataDaVenda;
	private String Cliente;
	private Double valorBruto;
	private String Desconto;
	private String ValorTotal;
	private String Status;
	
	
	
	public String getCodigoDaVenda() {
		return CodigoDaVenda;
	}
	public void setCodigoDaVenda(String codigoDaVenda) {
		CodigoDaVenda = codigoDaVenda;
	}
	//public String getDataDaVenda() {
	//	return dataDaVenda;
	//}
	//public void setDataDaVenda(String dataDaVenda) {
	//	this.dataDaVenda = dataDaVenda;
	//}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public Double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public String getDesconto() {
		return Desconto;
	}
	public void setDesconto(String desconto) {
		Desconto = desconto;
	}
	public String getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(String valorTotal) {
		ValorTotal = valorTotal;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	
		
	}
	
	
	

