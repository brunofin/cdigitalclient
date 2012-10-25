package bean;

import java.io.Serializable;

public class Categoria implements Serializable {
	private int categoriaId;
	private String nome;
	private String descricao;
	private Tipo tipo;
	
	public int getCategoriaId() {
		return categoriaId;
	}
	
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString(){
		return getTipo().getNome() + " :: " + getNome();
	}
	
	public boolean equals(Categoria c){
		if(c.getCategoriaId() == categoriaId){
			return true;
		}
		return false;
	}
}