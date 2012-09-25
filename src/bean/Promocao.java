package bean;

import java.util.Calendar;

public class Promocao {
	private int promocaoId;
	private String nome;
	private String descricao;
	private Calendar dataInicio;
	private Calendar validade;
	private Foto foto;
	
	public Promocao() {
		this.foto = new Foto();
		this.validade = Calendar.getInstance();
		this.dataInicio = Calendar.getInstance();
	}
	
	public int getPromocaoId() {
		return promocaoId;
	}

	public void setPromocaoId(int id) {
		this.promocaoId = id;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
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

	public Calendar getValidade() {
		return validade;
	}

	public void setValidade(Calendar validade) {
		this.validade = validade;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}	
}