package br.gov.cesarschool.poo.bonusvendas.entidade.geral;

import java.io.Serializable;

public class Endereco implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logradouro;
	private int numeroInteiro;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;

	public Endereco(String logradouro, int numeroInteiro, String complemento, String cep, String cidade, String estado,
			String pais) {
		super();
		this.logradouro = logradouro;
		this.numeroInteiro = numeroInteiro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumeroInteiro() {
		return numeroInteiro;
	}

	public void setNumeroInteiro(int numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
