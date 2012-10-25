package com.example.cardapiodigitalclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import servidor.comunicacao.Dispositivo;
import servidor.comunicacao.Pacote;

public class Cardapio implements Runnable {
	private static ObjectOutputStream out;
	private static ObjectInputStream in;
	private Dispositivo dispositivo;
	private String ip;
	private int porta;
	private static Socket cliente;
	private Pacote pacote;
	private static Object resposta;
	
	public Cardapio(Dispositivo dispositivo, String ip, int porta) {
		this.dispositivo = dispositivo;
		this.ip = ip;
		this.porta = porta;
		this.pacote = null;
	}
	
	
	public void run() {
		try {
			iniciar();
		} catch (Exception e) {
			System.out.println("erro");
		}

	}
	
	
	private void iniciar() throws IOException, ClassNotFoundException {
		cliente = new Socket(ip, porta); //TODO: botar pra pegar IP e porta na tela de entrada do cardapio junto com mesa
		
		out = new ObjectOutputStream(cliente.getOutputStream());
		in = new ObjectInputStream(cliente.getInputStream());
		
		out.writeObject(dispositivo); //envia para o servidor a identificação do dispositivo para obter conexão;
		
		while(true) { // main loop
			if(pacote != null) {
				resposta = null;
				
				System.out.println("<Cardapio> Enviando pacote... " + pacote.getMetodo());
				out.writeObject(pacote);
				
				System.out.println("<Cardapio> Retornando resposta " + resposta);
				resposta = in.readObject();
				
				pacote = null;
			}
			
			// TODO: verificar também se a conexão foi encerrada (intencionalmente) pelo servidor
		}
	}
	
	public Object enviarPacote(Pacote p) throws IOException, ClassNotFoundException {		
		this.pacote = p;
		while(resposta == null) {} // isso se chama gambiarra
		System.out.println("<Cardapio> Retornando resposta " + resposta);
		return resposta;
	}

}
