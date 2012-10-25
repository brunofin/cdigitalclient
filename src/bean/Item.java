package bean;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
	private int itemId;
	private String nome;
	private String descricao;
	private float preco;
	private List<Foto> fotos;
	private Categoria categoria;
	private List<Ingrediente> ingredientes;
	/**
	 * Atributo que só deve ser preenchido quando
	 * um item é incluído em um pedido. Só é 
	 * salvo no banco nesse caso (na tabela
	 * item_pedido).
	 */
	private String observacaoItemPedido;
	/**
	 * Atributo que só deve ser preenchido quando
	 * um item é incluído em um pedido ou em uma
	 * promocao. Só é salvo no banco nesses casos 
	 * (na tebela item_pedido ou na tabela 
	 * item_promocao).
	 */
	private int quantidadeItemPedido;
	
	public Item() {
	}
	
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int id) {
		this.itemId = id;
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public List<Foto> getFoto() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getObservacaoItemPedido() {
		return observacaoItemPedido;
	}


	public void setObservacaoItemPedido(String observacaoItemPedido) {
		this.observacaoItemPedido = observacaoItemPedido;
	}


	public int getQuantidadeItemPedido() {
		return quantidadeItemPedido;
	}


	public void setQuantidadeItemPedido(int quantidadeItemPedido) {
		this.quantidadeItemPedido = quantidadeItemPedido;
	}
	
	public String toString() {
		return getNome();
	}
}