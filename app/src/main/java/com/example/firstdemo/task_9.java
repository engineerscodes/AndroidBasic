package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class task_9 extends AppCompatActivity {

   ConstraintLayout parent;
     Button snackBarbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_9);
         parent=findViewById(R.id.parentConstLayout);
         snackBarbtn=findViewById(R.id.buttonMaterial);

        snackBarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              callSNACKMESSAGE();
            }
        });


    }

    public void callSNACKMESSAGE(){
        Snackbar.make(parent,"SNACK-BAR DEMO", Snackbar.LENGTH_INDEFINITE).setAction(" CLOSE ", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(task_9.this," CLOSED SNACK-BAR ",Toast.LENGTH_SHORT).show();
            }
        }).setActionTextColor(getResources().getColor(R.color.materialC
        )).setTextColor(Color.GREEN).show();
    }
}