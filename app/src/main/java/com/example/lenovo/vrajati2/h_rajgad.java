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

public class h_rajgad extends AppCompatActivity {
    public Button button8r;
    public void init()
    {
        button8r= (Button)findViewById(R.id.button8r);
        button8r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Rajgad_Fort");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7r;
    public void init4() {
        button7r = (Button) findViewById(R.id.button7r);
        button7r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_rajgad.this, map_raj.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9r;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9r= (Button) findViewById(R.id.button9r);
        button9r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Rajgad";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_rajgad.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_rajgad);
        init();
        init4();
        init5();
    }

}
