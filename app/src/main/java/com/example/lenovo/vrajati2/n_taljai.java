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

public class n_taljai extends AppCompatActivity
{

    public Button button8tj;
    public void init()
    {
        button8tj= (Button)findViewById(R.id.button8tj);
        button8tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Taljai_Hills");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }


    public Button button9tj;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9tj= (Button) findViewById(R.id.button9tj);
        button9tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Taljai";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_taljai.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button7tj;
    public void init4() {
        button7tj = (Button) findViewById(R.id.button7tj);
        button7tj.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_taljai.this, map_tul.class);
                startActivity(toy4);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_taljai);
        init();
        init4();
        init5();
    }

}
