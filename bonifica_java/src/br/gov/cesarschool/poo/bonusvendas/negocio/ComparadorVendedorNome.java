package br.gov.cesarschool.poo.bonusvendas.negocio;

import br.gov.cesarschool.poo.bonusvendas.entidade.Vendedor;
import br.gov.cesarschool.poo.bonusvendas.util.Comparador;

public class ComparadorVendedorNome implements Comparador{
	private static ComparadorVendedorNome instancia;
	public static ComparadorVendedorNome getInstance() {
		if (instancia == null) {
			instancia = new ComparadorVendedorNome();
		}
		return instancia;
	}
	private ComparadorVendedorNome() {
	}
	@Override
	public int comparar(Object o1, Object o2) {
		Vendedor v1 = (Vendedor) o1;
		Vendedor v2 = (Vendedor) o2;
		
		int result = v1.getNomeCompleto().compareTo(v2.getNomeCompleto());
		
		if(result > 0) {
			return 1;
		}else if(result < 0) {
			return -1;
		}else {
			return result;
		}
	}
}
