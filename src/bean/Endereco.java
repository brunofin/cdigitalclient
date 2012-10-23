package bean;

import java.io.Serializable;

import util.Estado;

public class Endereco implements Serializable {
	private int enderecoId;
	private String rua;
	private String numero;
	private String cep;
	private String bairro;
	private String cidade;
	private Estado estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Estado getEstado() {
		return estado;
	}
	

	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado.toUpperCase());
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	

	public int getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(int enderecoId) {
		this.enderecoId = enderecoId;
	}

}