package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class task_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_3);

        final CheckBox checkBoxs[]=new CheckBox[3];
        int chechBoxes_id[]={R.id.marvel,R.id.loki,R.id.joker};

        for( int i=0;i<checkBoxs.length;i++)
        {
                checkBoxs[i]=findViewById(chechBoxes_id[i]);
                final int finalI = i;
                checkBoxs[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                Toast.makeText(task_3.this,checkBoxs[finalI].getText().toString()+" CHECKED ",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(task_3.this," UN-CHECKED ",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

    }
}