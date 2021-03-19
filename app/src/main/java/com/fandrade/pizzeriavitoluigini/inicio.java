package com.fandrade.pizzeriavitoluigini;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inicio extends AppCompatActivity {
    TextView usuario;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        usuario=(TextView)findViewById(R.id.textusuario);
        leercredenciales();
    }
    private void leercredenciales() {
        preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        usuario.setText("Hola estimado  "+preferences.getString("user","")+" ¿Qué te podemos llevar hasta tu casa este día? Por favor selecciona: ");
    }
}