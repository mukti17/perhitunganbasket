package com.example.mukti_000.belajar_multyplelayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HewanLiar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan_liar);
        LinearLayout linear1 = (LinearLayout) findViewById(R.id.linear1);
        ArrayList<String> list_liar = new ArrayList<String>();
        list_liar.add("MONYET");
        list_liar.add("GAJAH");
        list_liar.add("SRIGALA");
        for (int i = 0; i < list_liar.size(); i++) {
            TextView view_liar = new TextView(HewanLiar.this);
            view_liar.setText(list_liar.get(i));
            linear1.addView(view_liar);
        }
        ArrayAdapter<String> Adapter_liar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list_liar);
        ListView listview_liar = (ListView) finzdViewById(R.id.adapter1);
        listview_liar.setAdapter(Adapter_liar);

    }
}
