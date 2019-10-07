package com.jcg.itics.tesoem.edu.proyectojcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrmPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_principal);
    }
    public void tics(View v){
        Intent tics = new Intent(this, ticsActivity.class);
        startActivity(tics);
        finish();
    }
    public void administracion(View v){
        Intent administracion = new Intent(this, administracionActivity.class);
        startActivity(administracion);
        finish();
    }
    public void sistemas(View v){
        Intent sistemas = new Intent(this, sistemasActivity.class);
        startActivity(sistemas);
        finish();
    }
    public void ambiental(View v){
        Intent ambiental = new Intent(this, ambientalActivity.class);
        startActivity(ambiental);
        finish();
    }
    public void industrial(View v){
        Intent industrial = new Intent(this, industrialActivity.class);
        startActivity(industrial);
        finish();
    }
    public void energias(View v){
        Intent energias = new Intent(this, energiasActivity.class);
        startActivity(energias);
        finish();
    }
    public void gastronomia(View v){
        Intent gastronomia = new Intent(this, gastronomiaActivity.class);
        startActivity(gastronomia);
        finish();
    }
    public void contaduria(View v){
        Intent contaduria = new Intent(this, contaduriaActivity.class);
        startActivity(contaduria);
        finish();
    }
}
