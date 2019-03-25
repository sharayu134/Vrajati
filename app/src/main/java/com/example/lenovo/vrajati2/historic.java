package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class historic extends AppCompatActivity {
    public ImageButton imageView210;
    public void inits() {
        imageView210 = (ImageButton) findViewById(R.id.imageView210);
        imageView210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_Shaniwarwada.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView310;
    public void initshiv() {
        imageView310 = (ImageButton) findViewById(R.id.imageView310);
        imageView310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_shivnerii.class);
                startActivity(toy4);
            }

        });

    }



    public ImageButton imageView510;
    public void initlal() {
        imageView510 = (ImageButton) findViewById(R.id.imageView510);
        imageView510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_lalmahal.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView1410;
    public void initchatri() {
        imageView1410 = (ImageButton) findViewById(R.id.imageView1410);
        imageView1410.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_chatri.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView810;
    public void initbhaja() {
        imageView810 = (ImageButton) findViewById(R.id.imageView810);
        imageView810.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_bhaja.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView1110;
    public void initsingh() {
        imageView1110 = (ImageButton) findViewById(R.id.imageView1110);
        imageView1110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_sinhgad.class);
                startActivity(toy4);
            }

        });

    }
    public ImageButton imageView1210;
    public void initraj() {
        imageView1210 = (ImageButton) findViewById(R.id.imageView1210);
        imageView1210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_rajgad.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView410;
    public void initvishram() {
        imageView410 = (ImageButton) findViewById(R.id.imageView410);
        imageView410.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(historic.this,h_vishram.class);
                startActivity(toy4);
            }

        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historic);
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
