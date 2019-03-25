package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class entertainment extends AppCompatActivity {


    public ImageButton imageView210ee;
    public void initbal()
    {
        imageView210ee= (ImageButton)findViewById(R.id.imageView210ee);
        imageView210ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://in.bookmyshow.com/venue/bal-gandharva-rang-mandir-pune/BGRM");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }


    public ImageButton  imageButton7;
    public void initwater()
    {
        imageButton7= (ImageButton)findViewById(R.id. imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.holidify.com/pages/waterparks-in-pune-391.html");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public ImageButton imageView410ee;
    public void initmov()
    {
        imageView410ee= (ImageButton)findViewById(R.id. imageView410ee);
        imageView410ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://in.bookmyshow.com/pune/movies");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }






    public ImageButton imageButton6;
    public void initappu() {
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(entertainment.this,e_appu.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageButton9;
    public void initimg() {
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(entertainment.this,e_imagica.class);
                startActivity(toy4);
            }

        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        initbal();
        initwater();
        initmov();
        initappu();
        initimg();
    }
}
