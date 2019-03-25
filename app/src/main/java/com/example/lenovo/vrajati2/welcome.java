package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class welcome extends AppCompatActivity {

    public Button button;
    public void init()
    {
        button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(welcome.this, ss.class);
                startActivity(toy);
            }

        });
    }
    public Button button2;
    public void init2() {
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy2 = new Intent(welcome.this, food.class);
                startActivity(toy2);
            }

        });
    }
    public Button button3;
    public void init3()
    {
        button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.makemytrip.com/hotels/pune-hotels.html");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button4;
            public void init4() {
                button4 = (Button) findViewById(R.id.button4);
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toy4 = new Intent(welcome.this, entertainment.class);
                        startActivity(toy4);
                    }

                });

            }
                public Button button5;
                public void init5() {
                    button5 = (Button) findViewById(R.id.button5);
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent toy5 = new Intent(welcome.this, shopping.class);
                            startActivity(toy5);
                        }

                    });
                }
    public ImageButton imageButton5;
    public void init1() {

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy5 = new Intent(welcome.this, fav_list.class);
                startActivity(toy5);
            }

        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        init();
        init2();
        init3();
        init4();
        init5();
        init1();
    }
}
