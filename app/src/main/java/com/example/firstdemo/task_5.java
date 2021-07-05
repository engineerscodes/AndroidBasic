package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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
                Toast.makeText(task_5.this,arr.get(position)+ "Selected !",Toast.LENGTH_SHORT).show();
            }
        });
    }
}