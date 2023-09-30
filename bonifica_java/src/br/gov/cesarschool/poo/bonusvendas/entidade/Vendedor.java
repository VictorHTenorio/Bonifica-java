package br.gov.cesarschool.poo.bonusvendas.entidade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo;

public class Vendedor {
	private String cpf;
	private String nomeCompleto;
	private br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo sexo;
	private java.time.LocalDate dataNascimento;
	private double renda;
	private br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco endereco;
	
	public Vendedor(String cpf, String nomeCompleto, Sexo sexo, LocalDate dataNascimento, double renda,
			Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.renda = renda;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo getSexo() {
		return sexo;
	}

	public void setSexo(br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo sexo) {
		this.sexo = sexo;
	}

	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(java.time.LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco endereco) {
		this.endereco = endereco;
	}
	
	private int calcularIdade() {
	    Period periodo = Period.between(dataNascimento, LocalDate.now());
	    return periodo.getYears();
	}
	
}
