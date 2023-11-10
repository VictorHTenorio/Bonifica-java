package br.gov.cesarschool.poo.bonusvendas.dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Registro;

public class DAOGenerico {
	CadastroObjetos cadastro;

	public DAOGenerico(Class<?> tipo) {
		super();
		cadastro = new CadastroObjetos(tipo);
	}
	
	private String obterId(Registro conteudo) {
		return conteudo.getIdUnico();
	}
	
	public boolean incluir(Registro reg) {
		String idUnico = obterId(reg);
		Registro novo = buscar(idUnico);
		if (novo != null) {
			return false;
		} else {
			cadastro.incluir(novo, idUnico);
			return true;
		}
	}
	
	public boolean alterar(Registro reg) {
		String idUnico = obterId(reg);
		Registro novo = buscar(idUnico);
		if (novo == null) {
			return false;
		} else {
			cadastro.alterar(reg, idUnico);
			return true;
		}
	}
	
	public Registro buscar(String id) {
		return (Registro)cadastro.buscar(id);
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
