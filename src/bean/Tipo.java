package bean;

import java.io.Serializable;

public class Tipo implements Serializable {
	private int tipoId;
	private String nome;
	
	public int getTipoId() {
		return tipoId;
	}
	
	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return getNome();
	}

}
