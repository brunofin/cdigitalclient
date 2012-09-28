package com.example.cardapiodigitalclient;

import java.util.List;

import bean.Item;

import servidor.comunicacao.Metodo;
import servidor.comunicacao.Pacote;
import singleton.Singleton;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.support.v4.app.NavUtils;
import android.text.Layout;

public class TipoActivity extends Activity {
	private View buttonPedido;
	private View buttonGarcom;
	private RelativeLayout tipoLayout;
	private View buttonCadastro;
	private View buttonLanguage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo);

		atribuir();
		popularTipoLayout();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_tipo, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void atribuir() {
		buttonPedido = findViewById(R.id.button_pedido);
		buttonGarcom = findViewById(R.id.button_garcom);
		tipoLayout = (RelativeLayout) findViewById(R.id.layout_tipo);
		buttonCadastro = findViewById(R.id.button_cadastro);
		buttonLanguage = findViewById(R.id.button_language);

	}

	private void popularTipoLayout() {
		
	}

}
