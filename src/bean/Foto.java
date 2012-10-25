package bean;

import java.io.Serializable;

public class Foto implements Serializable {
	private int fotoId;
	private String local_foto;
	private int itemId;

	public Foto() {
		
	}
	
	public Foto(String local) {
		this();
		setLocal_foto(local);
	}
	
	public int getFotoId() {
		return fotoId;
	}

	public void setFotoId(int id) {
		this.fotoId = id;
	}

	public String getLocal_foto() {
		return local_foto;
	}

	public void setLocal_foto(String local_foto) {
		this.local_foto = local_foto;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String toString() {
		return getLocal_foto();
	}
}