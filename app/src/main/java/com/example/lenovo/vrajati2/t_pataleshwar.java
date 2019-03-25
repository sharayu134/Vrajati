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

public class t_pataleshwar extends AppCompatActivity {
    public Button button8coppp;
    public void init()
    {
        button8coppp= (Button)findViewById(R.id.button8coppp);
        button8coppp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Pataleshwar");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7coppp;
    public void init4() {
        button7coppp = (Button) findViewById(R.id.button7coppp);
        button7coppp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_pataleshwar.this, map_pataleshwar.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9coppp;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9coppp= (Button) findViewById(R.id.button9coppp);
        button9coppp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Pataleshwar Temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_pataleshwar.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_pataleshwar);
        init();
        init5();
        init4();
    }

}
