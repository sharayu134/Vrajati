package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class museum extends AppCompatActivity {
    public ImageButton imageView210mm;
    public void inits() {
        imageView210mm= (ImageButton) findViewById(R.id.imageView210mm);
        imageView210mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_agakhan.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView310mm;
    public void initshiv() {
        imageView310mm = (ImageButton) findViewById(R.id.imageView310mm);
        imageView310mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_darshan.class);
                startActivity(toy4);
            }

        });

    }



    public ImageButton imageView510mm;
    public void initlal() {
        imageView510mm= (ImageButton) findViewById(R.id.imageView510mm);
        imageView510mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_rajadinkar.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView1410mm;
    public void initchatri() {
        imageView1410mm= (ImageButton) findViewById(R.id.imageView1410mm);
        imageView1410mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_tribal.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView810mm;
    public void initblades() {
        imageView810mm= (ImageButton) findViewById(R.id.imageView810mm);
        imageView810mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_bladesofglory.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView1110mm;
    public void initsingh() {
        imageView1110mm= (ImageButton) findViewById(R.id.imageView1110mm);
        imageView1110mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_phule.class);
                startActivity(toy4);
            }

        });

    }




    public ImageButton  imageView1210mm;
    public void initzz() {
        imageView1210mm= (ImageButton) findViewById(R.id.imageView1210mm);
        imageView1210mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_nationalwar.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView410mm;
    public void initvishram() {
        imageView410mm = (ImageButton) findViewById(R.id.imageView410mm);
        imageView410mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(museum.this,m_shivaji.class);
                startActivity(toy4);
            }

        });

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        initblades();
        initchatri();initlal();inits();initshiv();initsingh();initvishram();initzz();

    }
}
