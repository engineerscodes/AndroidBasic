package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class task_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_3);

        final CheckBox checkBoxs[]=new CheckBox[3];
        final int chechBoxes_id[]={R.id.marvel,R.id.loki,R.id.joker};


        for( int i=0;i<checkBoxs.length;i++) {
                checkBoxs[i]=findViewById(chechBoxes_id[i]);
                if(checkBoxs[i].isChecked()){
                    Toast.makeText(task_3.this,checkBoxs[i].getText().toString()+" CHECKED ",Toast.LENGTH_SHORT).show();
                }
                final int finalI = i;

                checkBoxs[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                //can use buttonView instead of checkBoxs[finalI]
                                Toast.makeText(task_3.this,checkBoxs[finalI].getText().toString()+" CHECKED ",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(task_3.this,checkBoxs[finalI].getText().toString()+" UN-CHECKED ",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        final RadioButton radionbtns[]=new RadioButton[2];
        int rbtn_id[]=new int[]{R.id.male,R.id.female};
        for(int i=0;i<radionbtns.length;i++){
            final int final_rid=i;
            radionbtns[i]=findViewById(rbtn_id[i]);

            radionbtns[i].setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Toast.makeText(task_3.this,buttonView.getText().toString()+" CHECKED ",Toast.LENGTH_SHORT).show();

                    }
                    else{

                        Toast.makeText(task_3.this,buttonView.getText().toString()+" UN-CHECKED ",Toast.LENGTH_SHORT).show();

                    }
                }
            });

           /* radionbtns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
                    if(radionbtns[final_rid].isChecked())
                       radionbtns[final_rid].setChecked(false);
                    else
                        radionbtns[final_rid].setChecked(true);
                }
            }); */




        }


        RadioGroup rg=findViewById(R.id.genders);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId ==R.id.g_male) {
                    Toast.makeText(task_3.this, "MALE SELECTED !", Toast.LENGTH_SHORT).show();
                     findViewById(R.id.prg).setVisibility(View.VISIBLE);
                     findViewById(R.id.prg2).setVisibility(View.GONE);
                }
                if (checkedId == R.id.g_female) {
                    Toast.makeText(task_3.this,"FE-MALE SELECTED !",Toast.LENGTH_SHORT).show();
                    findViewById(R.id.prg).setVisibility(View.GONE);
                    ProgressBar pg=findViewById(R.id.prg2);
                    pg.incrementProgressBy(10);
                    pg.setVisibility(View.VISIBLE);
                }
            }
        });



    }
}