package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView =findViewById(R.id.tv1);
        textView.setText("LONG PRESS --> TO UNLOCK TASK 2 TOGGLE !!");
        textView.setAllCaps(true);
        Toast.makeText(this,"APP CREATED",Toast.LENGTH_SHORT).show();

        final Button task2=findViewById(R.id.button4); //to access inside inner class
        task2.setVisibility(View.INVISIBLE);

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               // textView.setText("LONG P");
                //Button task2=findViewById(R.id.button4);

                if(task2.getVisibility()==View.VISIBLE){
                    task2.setVisibility(View.INVISIBLE);
                }
                else
                    task2.setVisibility(View.VISIBLE);

                Toast.makeText(MainActivity.this,"LONG PRESS",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        Button task3btn=findViewById(R.id.task3_btn);
        task3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent task3=new Intent(MainActivity.this,task_3.class);
                startActivity(task3);
            }
        });

        Button task4_LinearLayout=findViewById(R.id.button5);

        task4_LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent task4=new Intent(MainActivity.this,task_4.class);
                startActivity(task4);
            }
        });

        Button task_5ListView=findViewById(R.id.button6);

        task_5ListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent task5=new Intent(MainActivity.this,task_5.class);
                startActivity(task5);
            }
        });


        final Button task_6=findViewById(R.id.button7);

        task_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent task6=new Intent(MainActivity.this,task_6.class);
               startActivity(task6);
            }
        });

        Button task_7=findViewById(R.id.button8);

        task_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent task7=new Intent(MainActivity.this,task_7.class);
                startActivity(task7);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"APP STARTED",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"APP PAUSED",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(" Closed !!");
        Toast.makeText(this,"APP RIP",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"APP RESUMED !!",Toast.LENGTH_SHORT).show();
    }

    public  void onClickbtn(View v)
    {
        EditText editText =findViewById(R.id.input1);
        String txt=editText.getText().toString();
        TextView textView =findViewById(R.id.tv1);
        textView.setText(txt);
    }

    public void task_1(View v){
        Intent newIntent=new Intent(this,TaskActivity.class);
        startActivity(newIntent);
    }

    public void initent_filter(View v){
        EditText editText =findViewById(R.id.input1);
        String txt=editText.getText().toString();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT,txt);
        startActivity(sendIntent);

    }




}