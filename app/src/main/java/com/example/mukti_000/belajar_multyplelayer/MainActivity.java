package com.example.mukti_000.belajar_multyplelayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ternak = (TextView) findViewById(R.id.ternak);
        TextView liar = (TextView) findViewById(R.id.liar);
        TextView data_ternak = (TextView) findViewById(R.id.dataTernak);
        TextView data_liar = (TextView) findViewById(R.id.dataLiar);

        ternak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ternak= new Intent(MainActivity.this, HewanTernak.class);
                startActivity(intent_ternak);
            }
        });

        liar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_liar= new Intent(MainActivity.this, HewanLiar.class);
                startActivity(intent_liar);
            }
        });

        data_liar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_dataliar= new Intent(MainActivity.this, DataHewanLiar.class);
                startActivity(intent_dataliar);
            }
        });

        data_ternak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_dataternak= new Intent(MainActivity.this, DataHewanTernak.class);
                startActivity(intent_dataternak);
            }
        });

    }
}
