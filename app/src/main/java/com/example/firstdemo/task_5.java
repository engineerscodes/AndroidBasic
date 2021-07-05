package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;

public class task_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_5);

        ListView listView=findViewById(R.id.list_views);
        final ArrayList<String> arr=new ArrayList<String>();
        arr.add("Naveen");
        arr.add("BALA");
        arr.add("JAMES");
        arr.add("HULK");
        arr.add("LOKI");
        arr.add("TONY");
        arr.add("JACK");
        arr.add("Naveen");
        arr.add("BALA");
        arr.add("JAMES");
        arr.add("HULK");
        arr.add("LOKI");
        arr.add("TONY");
        arr.add("JACK");
        arr.add("Naveen");
        arr.add("BALA");
        arr.add("JAMES");
        arr.add("HULK");
        arr.add("LOKI");
        arr.add("TONY");
        arr.add("JACK");

        ArrayAdapter <String> NamesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);

        listView.setAdapter(NamesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(task_5.this,arr.get(position).toUpperCase()+ " Selected !".toUpperCase(),Toast.LENGTH_SHORT).show();
            }
        });

        final Spinner Cities=findViewById(R.id.cites);
        String namesC[]={"RCB","CSK","KKR","MI","DC","KXIP","GL","KLB","SRH","RR"};
        final ArrayList<String> citeName=new ArrayList<String>();
        for(int i=0;i<namesC.length;i++)
        {
            citeName.add(namesC[i]);
        }

        ArrayAdapter<String> CAP=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,citeName);
        Cities.setAdapter(CAP);
        Cities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(task_5.this,citeName.get(position).toUpperCase(),Toast.LENGTH_SHORT).show();
                //or
                Toast.makeText(task_5.this,Cities.getSelectedItem().toString().toUpperCase(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}