package com.example.cardapiodigitalclient;

import java.util.LinkedList;
import java.util.List;

import singleton.Singleton;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bean.Categoria;
import bean.Item;

public class CategoriaActivity extends Activity {
	List<View> lista;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        
        LinearLayout container = (LinearLayout) findViewById(R.id.linear_layout);
        
        lista = new LinkedList<View>();
        String tipo = getIntent().getStringExtra("EXTRA_TIPO");
        
        List<Categoria> listaCat = new LinkedList<Categoria>();
        List<Item> listaItem = new LinkedList<Item>();
        
        for(Item i : Singleton.ITEMS) {
        	if(i.getCategoria().getTipo().getNome().equalsIgnoreCase(tipo)) {
        		boolean contains = false;
        		for(Categoria c : listaCat){
        			if(c.getNome().equalsIgnoreCase(i.getCategoria().getNome()))
        				contains = true;
        		}
        		if(!contains)
        			listaCat.add(i.getCategoria());
        		listaItem.add(i);
        	}
        }
        
        for(Categoria c : listaCat) {
        	View v = getLayoutInflater().inflate(R.layout.list_categoria_header, null);
        	TextView titulo = (TextView) v.findViewById(R.id.list_header);
        	titulo.setText(c.getNome());
        	
        	lista.add(v);
        	
        	for(Item i : listaItem) {
        		if(i.getCategoria().getNome().equalsIgnoreCase(c.getNome())) {
        			View v2 = getLayoutInflater().inflate(R.layout.list_categoria_item, null);
        			TextView itemNome = (TextView) v2.findViewById(R.id.list_texto);
                	itemNome.setText(i.getNome());
                	
                	// também adicionar a imagem do item aqui
                	
                	lista.add(v2);
        		}
        	}
        }
        
        for(View v : lista) {
        	container.addView(v);
        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_categorias, menu);
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

}
