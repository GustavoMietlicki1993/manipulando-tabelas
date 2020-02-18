package com.tecnofit.model.db.table;

public class Contrato {
	
	private String id;
	private String nome;
	private String valorPadrao;
	private String numeroVigencia;
	private String tipoVigencia;
	private String codigoImportacao;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValorPadrao() {
		return valorPadrao;
	}
	public void setValorPadrao(String valorPadrao) {
		this.valorPadrao = valorPadrao;
	}
	public String getNumeroVigencia() {
		return numeroVigencia;
	}
	public void setNumeroVigencia(String numeroVigencia) {
		this.numeroVigencia = numeroVigencia;
	}
	public String getTipoVigencia() {
		return tipoVigencia;
	}
	public void setTipoVigencia(String tipoVigencia) {
		this.tipoVigencia = tipoVigencia;
	}
	public String getCodigoImportacao() {
		return codigoImportacao;
	}
	public void setCodigoImportacao(String codigoImportacao) {
		this.codigoImportacao = codigoImportacao;
	}
	
	

}
