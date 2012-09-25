package bean;

import java.util.Calendar;

public class Pedido {
	private int pedidoId;
	private Calendar data;
	private Cliente cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public int getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(int id) {
		this.pedidoId = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}