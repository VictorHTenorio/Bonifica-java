package br.gov.cesarschool.poo.bonusvendas.entidade;

public enum TipoResgate {
	PRODUTO(0, "Produto"),
	SERVICO(1, "Servico"),
	CASH(2, "Cash");
	
	private int codigo;
	private String descricao;
	
	private TipoResgate(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
