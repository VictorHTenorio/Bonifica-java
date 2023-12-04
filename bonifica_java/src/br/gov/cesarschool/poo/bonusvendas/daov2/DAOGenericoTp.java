package br.gov.cesarschool.poo.bonusvendas.daov2;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Registro;
import br.gov.cesarschool.poo.bonusvendas.excecoes.ExcecaoObjetoJaExistente;
import br.gov.cesarschool.poo.bonusvendas.excecoes.ExcecaoObjetoNaoExistente;

public class DAOGenericoTp<T extends Registro> {
    CadastroObjetos cadastro;
    private String nomeEntidade;
    private Class<T> tipo; // Adiciona um campo para armazenar o tipo

  public DAOGenericoTp(Class<T> tipo, String nomeEntidade) {
        this.cadastro = new CadastroObjetos(tipo);
        this.nomeEntidade = nomeEntidade;
        this.tipo = tipo; // Armazena o tipo passado no construtor
    }

    public void incluir(T reg) throws ExcecaoObjetoJaExistente {
        try {
            buscar(reg.getIdUnico());
            throw new ExcecaoObjetoJaExistente(nomeEntidade + " ja existente");
        } catch (ExcecaoObjetoNaoExistente e) {
            cadastro.incluir(reg, reg.getIdUnico());
        }
    }

    public void alterar(T reg) throws ExcecaoObjetoNaoExistente {
        buscar(reg.getIdUnico());
        cadastro.alterar(reg, reg.getIdUnico());
    }

    public T buscar(String id) throws ExcecaoObjetoNaoExistente {
        T registroBusca = (T) cadastro.buscar(id);
        if (registroBusca == null) {
            throw new ExcecaoObjetoNaoExistente(nomeEntidade + " nao existente");
        }
        return registroBusca;
    }

    public T[] buscarTodos() {
        Object[] rets = cadastro.buscarTodos(tipo); // Agora tipo está disponível
        T[] registros = (T[]) java.lang.reflect.Array.newInstance(tipo, rets.length); // Cria um array do tipo genérico
        for (int i = 0; i < rets.length; i++) {
            registros[i] = (T) rets[i];
        }
        return registros;
    }
}
