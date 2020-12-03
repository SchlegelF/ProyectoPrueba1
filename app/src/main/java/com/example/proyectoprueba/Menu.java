package com.example.proyectoprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class Menu extends AppCompatActivity {
    Button agenda,partners,pedido,envios,sigte,anterior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        agenda=(Button) findViewById(R.id.agenda);
        partners=(Button) findViewById(R.id.partners);
        pedido=(Button) findViewById(R.id.pedido);
        envios=(Button) findViewById(R.id.delegacion);
        sigte=(Button) findViewById(R.id.siguiente);
        anterior=(Button) findViewById(R.id.anterior);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
            //ir a la pagina anterior
        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pag_inicio(v);
            }
        });
        partners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                partner(v);
            }
        });
    }

    public void pag_inicio(View view ){
        Intent vorlver =new Intent(this,MainActivity.class);
        startActivity(vorlver);
    }
    public void partner(View view){
        Intent next=new  Intent(this,GestionPartner.class);
        startActivity(next);
    }
}