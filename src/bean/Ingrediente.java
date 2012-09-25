package bean;

public class Ingrediente {

	private int ingredienteId;
	private String nome;
	private float preco;
	
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
}