package com.jcg.itics.tesoem.edu.proyectojcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class industrialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industrial);
    }
    public void industrial1(View v){
        Intent FrmPrincipal = new Intent(this,FrmPrincipalActivity.class);
        startActivity(FrmPrincipal);
        finish();
    }
}
