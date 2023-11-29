package br.gov.cesarschool.poo.bonusvendas.daov2;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Registro;
import br.gov.cesarschool.poo.bonusvendas.excecoes.ExcecaoObjetoJaExistente;
import br.gov.cesarschool.poo.bonusvendas.excecoes.ExcecaoObjetoNaoExistente;

public class DAOGenerico {
	CadastroObjetos cadastro;
	private String nomeEntidade;

	public DAOGenerico(Class<?> tipo, String nomeEntidade) {
		super();
		this.cadastro = new CadastroObjetos(tipo);
		this.nomeEntidade = nomeEntidade;
	}
	public void incluir (Registro reg) throws ExcecaoObjetoJaExistente {
		try {
			buscar(reg.getIdUnico());
			throw new ExcecaoObjetoJaExistente(nomeEntidade + " ja existente");
		}catch (ExcecaoObjetoNaoExistente e){
			cadastro.incluir(reg, reg.getIdUnico());
		}
	}
	public void alterar(Registro reg) throws ExcecaoObjetoNaoExistente {
		buscar(reg.getIdUnico());
		cadastro.alterar(reg, reg.getIdUnico());
	}
	public Registro buscar(String id) throws ExcecaoObjetoNaoExistente{
		Registro registroBusca = (Registro) cadastro.buscar(id);
        if (registroBusca == null) {
            throw new ExcecaoObjetoNaoExistente(nomeEntidade + " nao existente");
        }
        return registroBusca;
	}
	public Registro[] buscarTodos() {
		Serializable[] rets = cadastro.buscarTodos(Registro.class);
		Registro[] registros = new Registro[rets.length];
		for(int i=0; i<rets.length; i++) {
			registros[i] = (Registro)rets[i];
		}
		return registros;
	}
}
