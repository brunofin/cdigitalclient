package bean;

import java.util.List;

public class Item {
	private int itemId;
	private String nome;
	private String descricao;
	private float preco;
	private List<Foto> fotos;
	private Categoria categoria;
	private List<Ingrediente> ingredientes;

	
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
}