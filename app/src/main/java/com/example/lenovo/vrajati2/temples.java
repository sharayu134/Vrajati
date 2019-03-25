package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.lenovo.vrajati2.R.id.imageView121044tt;

public class temples extends AppCompatActivity {

    public ImageButton imageView210tt;
    public void inits() {
        imageView210tt= (ImageButton) findViewById(R.id.imageView210tt);
        imageView210tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_iskcon.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView31044tt;
    public void initshiv() {
        imageView31044tt = (ImageButton) findViewById(R.id.imageView31044tt);
        imageView31044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_dagdu.class);
                startActivity(toy4);
            }

        });

    }



    public ImageButton imageView51044tt;
    public void initlal() {
        imageView51044tt = (ImageButton) findViewById(R.id.imageView51044tt);
        imageView51044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_chaturshringi.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView141044tt;
    public void initchatri() {
        imageView141044tt = (ImageButton) findViewById(R.id.imageView141044tt);
        imageView141044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_parvati.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView81044tt;
    public void initbhaja() {
        imageView81044tt = (ImageButton) findViewById(R.id.imageView81044tt);
        imageView81044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_kasba.class);
                startActivity(toy4);
            }

        });

    }


    public ImageButton imageView111044tt;
    public void initsingh() {
        imageView111044tt = (ImageButton) findViewById(R.id.imageView111044tt);
        imageView111044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_omkareshwar.class);
                startActivity(toy4);
            }

        });

    }




    public ImageButton  imageView121044tt;
    public void initzz() {
        imageView121044tt = (ImageButton) findViewById(R.id.imageView121044tt);
        imageView121044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_trishund.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageView41044tt;
    public void initvishram() {
        imageView41044tt = (ImageButton) findViewById(R.id.imageView41044tt);
        imageView41044tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(temples.this,t_pataleshwar.class);
                startActivity(toy4);
            }

        });

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);
        initbhaja();initchatri();initlal();inits();initshiv();initsingh();initvishram();initzz();
    }
}
