package com.example.cardapiodigitalclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente implements Runnable {
	
	private ObjectOutputStream out;
	private ObjectInputStream in;
	

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
		
		while(true) {
			String s = "teste porra!";
			out.writeObject(s);
		}
	}

}