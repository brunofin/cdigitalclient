package bean;

import java.io.Serializable;

public class Ingrediente implements Serializable {

	private int ingredienteId;
	private String nome;
	private float preco;
	private String descricao;
	/**
	 * Esse atributo só será salvo no 
	 * banco quando se tiver inserindo
	 * o ingrediente em um item
	 * ex: carreteiro usa 200g de arroz.
	 */
	private int quantidade;
	
	public Ingrediente() {
		// TODO Auto-generated constructor stub
	}

	public int getIngredienteId() {
		return ingredienteId;
	}

	public void setIngredienteId(int id) {
		this.ingredienteId = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}