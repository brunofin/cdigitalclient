package com.example.cardapiodigitalclient;


import bean.Item;
import bean.Tipo;
import android.widget.TableRow.LayoutParams;
import singleton.Singleton;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.support.v4.app.NavUtils;

public class TipoActivity extends Activity {
	private View buttonPedido;
	private View buttonGarcom;
	private TableLayout tipoLayout;
	private View buttonCadastro;
	private View buttonLanguage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo);

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
		// criar nova row (linha ou coluna? :p)
		for(Tipo t : Singleton.TIPOS) {
			TableRow tr = new TableRow(this);
			tr.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
			
			Button b = new Button(this);
			b.setText(t.getNome());
			b.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
			tr.addView(b);
			
			tipoLayout.addView(tr, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		}
	}

}
