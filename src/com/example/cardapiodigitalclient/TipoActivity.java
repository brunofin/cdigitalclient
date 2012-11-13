package com.example.cardapiodigitalclient;

import java.util.LinkedList;
import java.util.List;

import singleton.Singleton;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import bean.Tipo;

public class TipoActivity extends Activity implements OnClickListener {
	private List<View> botoes;
	private View buttonPedido;
	private View buttonGarcom;
	private TableLayout tipoLayout;
	private View buttonCadastro;
	private View buttonLanguage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo);

		botoes = new LinkedList<View>();
		buttonPedido = findViewById(R.id.button_pedido);
		buttonGarcom = findViewById(R.id.button_garcom);
		tipoLayout = (TableLayout) findViewById(R.id.layout_tipo);
		buttonCadastro = findViewById(R.id.button_cadastro);
		buttonLanguage = findViewById(R.id.button_language);

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

	private void popularTipoLayout() {
		TableRow tr = new TableRow(this);
		boolean switchRow = true;
		int id = 784000; // não, esse número não tem lógica, e sim, ele é
							// aleatório..
		for (Tipo t : Singleton.TIPOS) {
			if (switchRow)
				tr = new TableRow(this);
			tr.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
					LayoutParams.WRAP_CONTENT));

			Button b = new Button(this);
			b.setId(id);
			b.setText(t.getNome());
			b.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
					LayoutParams.WRAP_CONTENT));
			b.setOnClickListener(this);
			tr.addView(b);
			botoes.add(b);

			if (switchRow)
				tipoLayout.addView(tr, new LayoutParams(
						LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));

			switchRow = !switchRow;
		}
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_pedido:
			break;
		case R.id.button_garcom:
			break;
		case R.id.button_cadastro:
			break;
		case R.id.button_language:
			break;
		case 784000:
			System.out.println("<TipoActivity> Um botão de Tipo foi clicado.");
			Button aux = (Button) v;
			Intent i = new Intent(getBaseContext(), CategoriaActivity.class);
			i.putExtra("EXTRA_TIPO", aux.getText());
			startActivity(i);
			break;

		}

	}

}
