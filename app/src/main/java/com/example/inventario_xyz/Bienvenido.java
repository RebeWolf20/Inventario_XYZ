package com.example.inventario_xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {
    private TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        Resultado = findViewById(R.id.txt_nombre_resul);
        String nombreUsuario = getIntent().getStringExtra("Usuario");
        Resultado.setText("Bienvenido(a) " + nombreUsuario);

    }
    public void nuevoCata(View view){
        Intent cata = new Intent(Bienvenido.this, Crud_Catalogo.class);
        startActivity(cata);
    }
}