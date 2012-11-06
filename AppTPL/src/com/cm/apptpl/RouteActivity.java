package com.cm.apptpl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RouteActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
    }
	
	public void Inicio(View view) {
		finish();
	}
	
	public void Ingresar(View view) {
		Intent i = new Intent(getBaseContext(), CustomerActivity.class);
		startActivity(i);
	}
}
