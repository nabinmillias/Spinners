package com.example.spinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
Spinner spin1;
Spinner spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin1=findViewById(R.id.spinba);
        spin2=findViewById(R.id.spinsem);
       ArrayList<String> Batch= new ArrayList<String>();
       ArrayList<String>Sem=new ArrayList<String>();
       ArrayAdapter<String> adapt=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Batch);
        Batch.add("Select");
        Batch.add("Cs");
        Batch.add("EEE");
        Batch.add("Civil");
        Batch.add("Mech");

        spin1.setAdapter(adapt);
        ArrayAdapter<String> adap=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Sem);
        Sem.add("Select");
        Sem.add("S1");
        Sem.add("S2");
        Sem.add("S3");
        Sem.add("S4");
        Sem.add("S5");
        Sem.add("S6");
        Sem.add("S7");
        Sem.add("S8");
        spin2.setAdapter(adap);
    }

}
