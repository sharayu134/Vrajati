package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ss extends AppCompatActivity {


    public ImageButton imageButton;
    public void init() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(ss.this,naturenwildlife.class);
                startActivity(toy4);
            }

        });

    }






    public ImageButton imageButton2;
    public void init1() {
        imageButton2= (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy33= new Intent(ss.this,historic.class);
                startActivity(toy33);
            }

        });

    }

    public ImageButton imageButton3;
    public void init3() {
        imageButton3 =(ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy33= new Intent(ss.this,museum.class);
                startActivity(toy33);
            }

        });

    }

    public ImageButton imageButton4;
    public void init4() {
        imageButton4 =(ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy33= new Intent(ss.this,temples.class);
                startActivity(toy33);
            }

        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        init();
        init1();
       // init2();
        init3();
        init4();
    }
}
