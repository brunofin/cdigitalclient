package bean;

import java.io.Serializable;

public class Cozinheiro extends Pessoa implements Serializable {
	private String historico;
	private String especialidade;
	private String telefone;
	private String celular;
	private Foto foto;
	
	public Cozinheiro() {
		this.foto = new Foto();
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String toString() {
		return getNome() + " " + getSobrenome();
	}
}