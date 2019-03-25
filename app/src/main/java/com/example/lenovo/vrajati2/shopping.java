package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class shopping extends AppCompatActivity {
    public ImageButton imageView210ss;
    public void initfs() {
        imageView210ss = (ImageButton) findViewById(R.id.imageView210ss);
        imageView210ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(shopping.this,s_fs.class);
                startActivity(toy4);
            }

        });

    }
    public ImageButton imageButton6ss;
    public void initamn() {
        imageButton6ss = (ImageButton) findViewById(R.id.imageButton6ss);
        imageButton6ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(shopping.this,s_amnora.class);
                startActivity(toy4);
            }

        });

    }
    public ImageButton imageButton7ss;
    public void initfc() {
        imageButton7ss = (ImageButton) findViewById(R.id.imageButton7ss);
        imageButton7ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(shopping.this,s_fc.class);
                startActivity(toy4);
            }

        });

    }

    public ImageButton imageButton9ss;
    public void initfnx() {
        imageButton9ss = (ImageButton) findViewById(R.id.imageButton9ss);
        imageButton9ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(shopping.this,s_pheonix.class);
                startActivity(toy4);
            }

        });

    }
    public ImageButton imageView410ss;
    public void inittulsi() {
        imageView410ss= (ImageButton) findViewById(R.id.imageView410ss);
        imageView410ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(shopping.this,s_tulsi.class);
                startActivity(toy4);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        initfs();
        initamn();
        initfc();
        initfnx();
        inittulsi();
    }

}
