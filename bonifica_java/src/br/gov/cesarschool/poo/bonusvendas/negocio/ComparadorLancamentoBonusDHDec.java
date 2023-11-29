package br.gov.cesarschool.poo.bonusvendas.negocio;

import java.util.Comparator;

import br.gov.cesarschool.poo.bonusvendas.entidade.LancamentoBonus;

public class ComparadorLancamentoBonusDHDec implements Comparator{
	private static ComparadorLancamentoBonusDHDec instancia;
	public static ComparadorLancamentoBonusDHDec getInstance() {
		if (instancia == null) {
			instancia = new ComparadorLancamentoBonusDHDec();
		}
		return instancia;
	}
	private ComparadorLancamentoBonusDHDec(){
	}
	@Override
	public int compare(Object o1, Object o2) {
		LancamentoBonus lB1 = (LancamentoBonus) o1;
		LancamentoBonus lB2 = (LancamentoBonus) o2;
		
		if (lB2.getDataHoraLancamento().isAfter(lB1.getDataHoraLancamento())) {
            return 1;
        } else if (lB2.getDataHoraLancamento().isEqual(lB1.getDataHoraLancamento())) {
            return 0;
        } else {
            return -1;
        }
	}
}
