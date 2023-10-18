package br.gov.cesarschool.poo.bonusvendas.entidade;

import java.time.LocalDateTime;

public class LancamentoBonusDebito extends LancamentoBonus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TipoResgate tipoResgate;

	public LancamentoBonusDebito(long numeroDeCaixasDeBonus, double valor, LocalDateTime dataHoraLancamento, TipoResgate tipoResgate) {
		super(numeroDeCaixasDeBonus, valor, dataHoraLancamento);
		this.tipoResgate = tipoResgate;
	}
	
	
	public TipoResgate getTipoResgate() {
		return tipoResgate;
	}
}
