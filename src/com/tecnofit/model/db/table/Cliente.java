package com.tecnofit.model.db.table;

public class Cliente {

	private String id;
	private String nome;
	private String email;
	private String cpf;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCodigoImportacao() {
		return codigoImportacao;
	}
	public void setCodigoImportacao(String codigoImportacao) {
		this.codigoImportacao = codigoImportacao;
	}

	

}
