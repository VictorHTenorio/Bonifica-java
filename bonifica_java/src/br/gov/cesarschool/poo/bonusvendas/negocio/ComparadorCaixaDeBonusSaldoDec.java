package br.gov.cesarschool.poo.bonusvendas.negocio;

import br.gov.cesarschool.poo.bonusvendas.entidade.CaixaDeBonus;
import br.gov.cesarschool.poo.bonusvendas.util.Comparador;

public class ComparadorCaixaDeBonusSaldoDec implements Comparador{
	private static ComparadorCaixaDeBonusSaldoDec instancia;
	public static ComparadorCaixaDeBonusSaldoDec getInstance() {
		if (instancia == null) {
			instancia = new ComparadorCaixaDeBonusSaldoDec();
		}
		return instancia;
	}
	private ComparadorCaixaDeBonusSaldoDec(){
	}
	@Override
	public int comparar(Object o1, Object o2) {
		CaixaDeBonus v1 = (CaixaDeBonus) o1;
		CaixaDeBonus v2 = (CaixaDeBonus) o2;
		
		if(v1.getSaldo() == v2.getSaldo()) {
			return 0;
		}else if(v1.getSaldo() < v2.getSaldo()) {
			return 1;
		}else {
			return -1;
		}
	}
}
