package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class m_rajadinkar extends AppCompatActivity
{
    public Button button8rr;
    public void init()
    {
        button8rr= (Button)findViewById(R.id.button8rr);
        button8rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Raja_Dinkar_Kelkar_Museum");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7rr;
    public void init4() {
        button7rr = (Button) findViewById(R.id.button7rr);
        button7rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(m_rajadinkar.this, map_raja_din_kel.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9rr;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5()
    {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9rr= (Button) findViewById(R.id.button9rr);
        button9rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Raja Dinkar Kelkar";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_rajadinkar.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_rajadinkar);
        init();
        init4();
        init5();
    }

}
