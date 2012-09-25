package server;

/**
 * Usada para identificar de forma única qual o dispositivo.
 * É usada para criar a conexão inicial entre servidor e clientes.
 * @author bruno
 * @see android.provider.ANDROID_ID
 */
public class Device implements java.io.Serializable {
	/**
	 * Gerado pelo dispositivo Android e somente ele.
	 * Garantirá qual dispositivo está acossiado com a mesa.
	 */
	private String android_id;
	/**
	 * O número da mesa pelo sistema do restaurante
	 * Deverá ser definido no cardápio antes de iniciar a conexão.
	 */
	private String mesa;
	
	public String getAndroid_id() {
		return android_id;
	}
	
	public void setAndroid_id(String android_id) {
		this.android_id = android_id;
	}
	
	public String getMesa() {
		return mesa;
	}
	
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
}
