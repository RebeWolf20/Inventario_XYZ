package com.example.inventario_xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private EditText Usuario, Password;
    private ProgressBar pb;
    private Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.pb_circulo);
        Usuario = findViewById(R.id.et_usunombre);
        Password = findViewById(R.id.et_password);
        iniciar = findViewById(R.id.btn_sesion);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Task().execute(Usuario.getText().toString());
            }
        });

    }class Task extends AsyncTask<String, Void, String>{

        @Override
        protected void onPreExecute(){
            pb.setVisibility(View.VISIBLE);
            iniciar.setEnabled(false);
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return strings[0];
        }

        @Override
        protected void onPostExecute(String s){
            pb.setVisibility(View.VISIBLE);
            iniciar.setEnabled(true);
            Intent inte = new Intent(MainActivity.this, Bienvenido.class);
            inte.putExtra("Usuario",Usuario.getText().toString());
            startActivity(inte);
        }
    }
}