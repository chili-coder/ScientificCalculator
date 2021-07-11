package com.sohaghlab.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmulti,bdivition,bdot,bpie,bsqr,broot,biny;
    Button btan,bfact,blog,bln,bsin,bcos;
    Button bb1,bb2,bC,bac;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.bone);
        b2=findViewById(R.id.btwo);
        b3=findViewById(R.id.bthree);
        b4=findViewById(R.id.bfore);
        b5=findViewById(R.id.bfive);
        b6=findViewById(R.id.bsix);
        b7=findViewById(R.id.bseven);
        b8=findViewById(R.id.beignt);
        b9=findViewById(R.id.bnine);
        b0=findViewById(R.id.bzro);
        bplus=findViewById(R.id.bplus);
        bminus=findViewById(R.id.bmines);
        bmulti=findViewById(R.id.bmulti);
        bdivition=findViewById(R.id.bdivition);
        bsqr=findViewById(R.id.bsrure);
        bdot=findViewById(R.id.bdot);
        bpie=findViewById(R.id.bpie);
        biny=findViewById(R.id.biny);
        bfact=findViewById(R.id.bfact);
        bln=findViewById(R.id.bln);
        blog=findViewById(R.id.blog);
        broot=findViewById(R.id.broot);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bac=findViewById(R.id.bac);
        bC=findViewById(R.id.bc);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        bcos=findViewById(R.id.bcos);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);

        ///now insert

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = t1.getText().toString();
                value= value.substring(0,value.length()-1);
                t1.setText(value);
            }
        });



    }
}