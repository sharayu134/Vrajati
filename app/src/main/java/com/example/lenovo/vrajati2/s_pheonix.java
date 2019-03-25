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

public class s_pheonix extends AppCompatActivity {
    public Button button8csspp;
    public void init()
    {
        button8csspp= (Button)findViewById(R.id.button8csspp);
        button8csspp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.phoenixmarketcity.com/pune");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7csspp;
    public void init4() {
        button7csspp = (Button) findViewById(R.id.button7csspp);
        button7csspp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(s_pheonix.this, map_ph.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9csspp;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9csspp= (Button) findViewById(R.id.button9csspp);
        button9csspp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Phoenix Marketcity";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(s_pheonix.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_pheonix);
        init();
        init4();
        init5();
    }

}
