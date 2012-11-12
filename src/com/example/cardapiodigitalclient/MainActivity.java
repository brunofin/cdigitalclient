package com.example.cardapiodigitalclient;

import servidor.comunicacao.Dispositivo;
import servidor.comunicacao.Metodo;
import servidor.comunicacao.Pacote;
import singleton.Singleton;
import bean.Categoria;
import bean.Item;
import bean.Tipo;

import java.util.LinkedList;
import java.util.List;

import android.os.Bundle;
import android.provider.Settings.Secure;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private View button;
	private EditText mesa;
	private EditText ip;
	private Thread t;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = findViewById(R.id.buttonConectar);
		button.setOnClickListener(this);

		mesa = (EditText) findViewById(R.id.mainMesa);
		ip = (EditText) findViewById(R.id.mainIp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.buttonConectar:
			Dispositivo d = new Dispositivo();
			d.setAndroid_id(Secure.getString(getBaseContext().getContentResolver(),
					Secure.ANDROID_ID));
			d.setMesa(mesa.getText().toString());
			
			Singleton.CARDAPIO = new Cardapio(d, ip.getText().toString(), 4445);
			t = new Thread(Singleton.CARDAPIO);
			
			t.start();
			
			criarEstruturaCardapio();

			startActivity(new Intent(getBaseContext(), TipoActivity.class));
		}

	}

	@SuppressWarnings("unchecked")
	private void criarEstruturaCardapio() {
		Pacote p1 = new Pacote(Metodo.LISTAR_ITEMS, null);

		try {
			System.out.println("<MainActivity> Enviando pacote...");
			Singleton.ITEMS = (List<Item>) ((Pacote) Singleton.CARDAPIO.enviarPacote(p1)).getArgumentos();
			System.out.println("<MainActivity> Lista de Itens recebida! Total de itens atual: " + Singleton.ITEMS.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Tipo> tipos = new LinkedList<Tipo>();
		List<Categoria> categorias = new LinkedList<Categoria>();
		for(Item i : Singleton.ITEMS) {
			Categoria c = i.getCategoria();
			Tipo t = c.getTipo();
			if(!categorias.contains(c)) categorias.add(c);
			if(!tipos.contains(t)) tipos.add(t);
		}
		Singleton.CATEGORIAS = categorias;
		Singleton.TIPOS = tipos;
	}

}
