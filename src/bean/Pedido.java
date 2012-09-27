package bean;

import java.util.Calendar;
import java.util.List;

public class Pedido {
	private int pedidoId;
	private Calendar data;
	private Cliente cliente;
	private List <Item> itens;
	
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

	public List <Item> getItens() {
		return itens;
	}

	public void setItens(List <Item> itens) {
		this.itens = itens;
	}
}