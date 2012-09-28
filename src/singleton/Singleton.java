package singleton;

import java.util.List;

import com.example.cardapiodigitalclient.Cliente;

import bean.Categoria;
import bean.Item;
import bean.Tipo;

public final class Singleton {
	/**
	 * Conexão do dispositivo com o servidor
	 */
	public static Cliente CLIENTE;
	
	public static List<Item> ITEMS;
	public static List<Categoria> CATEGORIAS;
	public static List<Tipo> TIPOS;
}
