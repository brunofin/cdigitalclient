package servidor.comunicacao;

import java.io.Serializable;

/**
 * Ver descrição em servidor.comunicacao.GerenciadorComunicacao
 * @see servidor.comunicacao.GerenciadorComunicacao
 *
 */
public class Pacote implements Serializable {
	private Metodo metodo;
	private Object argumentos;
	
	public Pacote() {
		super();
	}
	
	public Pacote(Metodo metodo, Object argumentos) {
		this();
		this.metodo = metodo;
		this.argumentos = argumentos;
	}
	
	public Metodo getMetodo() {
		return metodo;
	}
	
	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}
	
	public Object getArgumentos() {
		return argumentos;
	}
	
	public void setArgumentos(Object argumentos) {
		this.argumentos = argumentos;
	}
}
