package com.example.cardapiodigitalclient;

import server.Device;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	private View button;
	private Thread t;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = findViewById(R.id.button1);
        button.setOnClickListener(this);
        
        Device d = new Device();
        d.setAndroid_id(Secure.getString(getBaseContext().getContentResolver(), Secure.ANDROID_ID));
        d.setMesa("14");
        
        t = new Thread(new Cliente(d));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		t.start();
		
	}
}
