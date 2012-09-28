package com.example.cardapiodigitalclient;

import servidor.comunicacao.Dispositivo;
import servidor.comunicacao.Metodo;
import servidor.comunicacao.Pacote;
import singleton.Singleton;
import bean.Item;
import bean.Tipo;
import bean.Categoria;
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
	private Thread t;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = findViewById(R.id.button1);
		button.setOnClickListener(this);

		mesa = (EditText) findViewById(R.id.editText1);

		Dispositivo d = new Dispositivo();
		d.setAndroid_id(Secure.getString(getBaseContext().getContentResolver(),
				Secure.ANDROID_ID));
		d.setMesa(mesa.getText().toString());

		Singleton.CLIENTE = new Cliente(d);
		t = new Thread(Singleton.CLIENTE);

		criarEstruturaCardapio();

		startActivity(new Intent(getBaseContext(), TipoActivity.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		t.start();

	}

	@SuppressWarnings("unchecked")
	private void criarEstruturaCardapio() {
		Pacote p1 = new Pacote(Metodo.LISTAR_ITEMS, null);
		Pacote p2 = new Pacote(Metodo.LISTAR_CATEGORIAS, null);
		Pacote p3 = new Pacote(Metodo.LISTAR_TIPOS, null);

		try {
			Singleton.ITEMS = (List<Item>) ((Pacote) Singleton.CLIENTE.enviarPacote(p1)).getArgumentos();
			Singleton.CATEGORIAS = (List<Categoria>) ((Pacote) Singleton.CLIENTE.enviarPacote(p2)).getArgumentos();
			Singleton.TIPOS = (List<Tipo>) ((Pacote) Singleton.CLIENTE.enviarPacote(p3)).getArgumentos();
		} catch (Exception e) {
		}
	}

}
