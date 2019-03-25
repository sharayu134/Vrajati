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

public class h_bhaja extends AppCompatActivity {
    public Button button8b;
    public void init()
    {
        button8b= (Button)findViewById(R.id.button8b);
        button8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Bhaja_Caves");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public Button button7b;
    public void init4() {
        button7b = (Button) findViewById(R.id.button7b);
        button7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_bhaja.this, map_bhaja.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9b;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;
    public void init5() {

//        myref = FirebaseDatabase.getInstance().getReference("Users");
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9b= (Button) findViewById(R.id.button9b);
        button9b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="bhaja leni";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_bhaja.this,"Added as favourite",Toast.LENGTH_SHORT).show();

            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_bhaja);
        init();
        init5();
        init4();
    }



}
