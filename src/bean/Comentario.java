package bean;

import java.io.Serializable;
import java.util.Calendar;

public class Comentario implements Serializable {
	private int comentarioId;
	private String comentario;
	private Calendar data;
	private Item item;
	private Cliente cliente;

	public int getComentarioId() {
		return comentarioId;
	}

	public void setComentarioId(int comentarioId) {
		this.comentarioId = comentarioId;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String toString() {
		return getData().get(Calendar.DAY_OF_MONTH) + "/"
				+ getData().get(Calendar.MONTH) + 1 + " "
				+ getCliente().getNome() + " " + getCliente().getSobrenome();
	}
}