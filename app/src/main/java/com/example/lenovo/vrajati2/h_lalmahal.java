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

public class h_lalmahal extends AppCompatActivity {
    //button7l

    public Button button7l;
    public void init4() {
        button7l = (Button) findViewById(R.id.button7l);
        button7l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_lalmahal.this, map_lal.class);
                startActivity(toy4);
            }

        });

    }



    public Button button8l;
    public void init()
    {
        button8l= (Button)findViewById(R.id.button8l);
        button8l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Lalmahal");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }



    public Button button9l;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;
    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9l= (Button) findViewById(R.id.button9l);
        button9l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Lalmahal";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_lalmahal.this,"Added as favourite",Toast.LENGTH_SHORT).show();
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_lalmahal);
        init();
        init4();
        init5();
    }

}
