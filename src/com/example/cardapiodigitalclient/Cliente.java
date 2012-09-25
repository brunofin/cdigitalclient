package com.example.cardapiodigitalclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import server.Device;

public class Cliente implements Runnable {
	private ObjectOutputStream out;
	private ObjectInputStream in;
	private Device device;
	
	public Cliente(Device device) {
		this.device = device;
	}
	

	public void run() {
		try {
			iniciar();
		} catch (IOException e) {
			System.out.println("erro");
		}

	}
	
	private void iniciar() throws IOException {
		Socket cliente = new Socket("100.10.0.102", 4445);
		
		out = new ObjectOutputStream(cliente.getOutputStream());
		in = new ObjectInputStream(cliente.getInputStream());
		
		out.writeObject(device); //envia para o servidor a identificação do dispositivo para obter conexão;
		
		for(int i = 0; i<50; i++) {
			out.writeObject(new String("teste porra!"));
		}
		out.writeObject(new String("shutdown"));
	}

}
