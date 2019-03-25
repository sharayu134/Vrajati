package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class naturenwildlife extends AppCompatActivity {

    public ImageButton imageView2;
    public void inits() {
        imageView2 = (ImageButton) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_rajiv.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView3;
    public void initshiv() {
        imageView3= (ImageButton) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_taljai.class);
                startActivity(toy4);
            }

        });

    }



    public ImageButton imageView5;
    public void initlal() {
        imageView5 = (ImageButton) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_butterfly.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView14;
    public void initchatri() {
        imageView14= (ImageButton) findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_bhima.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView8;
    public void initbhaja() {
        imageView8= (ImageButton) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_salim.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView11;
    public void initsingh() {
        imageView11= (ImageButton) findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_vetal.class);
                startActivity(toy4);
            }

        });

    }
    public ImageButton imageView12;
    public void initraj() {
        imageView12= (ImageButton) findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_parvati.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView4;
    public void initvishram() {
        imageView4= (ImageButton) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(naturenwildlife.this,n_mayureshwar.class);
                startActivity(toy4);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturenwildlife);
        inits();
        initshiv();
        initlal();
        initbhaja();
        initsingh();
        initraj();
        initchatri();
        initvishram();


    }
}
