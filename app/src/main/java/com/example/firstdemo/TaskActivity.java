package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button btn=findViewById(R.id.button3);
        //btn.setOnClickListener(O);
    }

    public void regdisplay(View v){
        EditText editText[]=new EditText[3];
        for(int i=0;i<3;i++)
        {   if (i ==0)
             {
            editText[i]=findViewById(R.id.editTextTextPersonName);
             }
           else if (i==1) //lastname
            {editText[i]=findViewById(R.id.editTextTextPersonName2);

            }
           else
            {
               editText[i]= findViewById(R.id.editTextTextPersonName3);

           }

        }

        TextView t1,t2,t3;
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView4);
        t3=findViewById(R.id.textView5);
        t1.setText("first name :"+editText[0].getText().toString());
        t2.setText("last name :"+editText[1].getText().toString());
        t3.setText("email :"+editText[2].getText().toString());

    }



}