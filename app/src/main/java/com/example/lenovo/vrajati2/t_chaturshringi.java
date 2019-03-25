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

public class t_chaturshringi extends AppCompatActivity

{
    public Button button8c;
    public void init()
    {
        button8c= (Button)findViewById(R.id.button8c);
        button8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Chaturshringi_Temple");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7c;
    public void init4() {
        button7c = (Button) findViewById(R.id.button7c);
        button7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_chaturshringi.this, map_chatur.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9c;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9c= (Button) findViewById(R.id.button9c);
        button9c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Chaturshringi_Temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_chaturshringi.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_chaturshringi);
        init();
        init5();
        init4();
    }

}
