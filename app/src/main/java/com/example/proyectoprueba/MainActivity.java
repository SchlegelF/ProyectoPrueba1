package com.example.proyectoprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        inicio=(Button) findViewById(R.id.comezar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      inicio.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              irMenu(v);
          }
      });

    }
    public void irMenu(View view ){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}