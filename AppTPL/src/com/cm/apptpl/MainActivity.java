package com.cm.apptpl;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:     Toast.makeText(this, "Holaa!", Toast.LENGTH_LONG).show();
                                break;
        }
        return true;
    }
    
    public void Ingresar(View view) {
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this); 
		alertDialog.setMessage("Se necesita establecer comunicación con el satélite. Ubicarse al aire libre antes de confirmar"); 
		alertDialog.setTitle("Confirmar Inicio de Actividades"); 
		alertDialog.setIcon(android.R.drawable.ic_dialog_alert); 
		alertDialog.setCancelable(false); 
		alertDialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() 
		{ 
			public void onClick(DialogInterface dialog, int which) 
			{ 
				Intent i = new Intent(getBaseContext(), RouteActivity.class);
				startActivity(i);
		    }
		}); 
		alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() 
		{ 
			public void onClick(DialogInterface dialog, int which) 
			{ 
		        //código java si se ha pulsado no 
			}
		});
		alertDialog.show();
    }
    
    public void Salir(View view) {
    	finish();
    }
}