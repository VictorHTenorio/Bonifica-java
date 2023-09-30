package br.gov.cesarschool.poo.bonusvendas.entidade;

import java.time.LocalDateTime;

public class LancamentoBonus {
	private long numeroDeCaixasDeBonus;
	private double valor;
	private java.time.LocalDateTime dataHoraLancamento;
	
	public LancamentoBonus(long numeroDeCaixasDeBonus, double valor, LocalDateTime dataHoraLancamento) {
		super();
		this.numeroDeCaixasDeBonus = numeroDeCaixasDeBonus;
		this.valor = valor;
		this.dataHoraLancamento = dataHoraLancamento;
	}

	public long getNumeroDeCaixasDeBonus() {
		return numeroDeCaixasDeBonus;
	}

	public double getValor() {
		return valor;
	}
	
	public java.time.LocalDateTime getDataHoraLancamento() {
		return dataHoraLancamento;
	}
	
	
	
}
