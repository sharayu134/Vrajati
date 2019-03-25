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

public class h_sinhgad extends AppCompatActivity {
    public Button button8sd;
    public void init()
    {
        button8sd= (Button)findViewById(R.id.button8sd);
        button8sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Sinhagad");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public Button button9sd;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;
    public void init5() {

//        myref = FirebaseDatabase.getInstance().getReference("Users");
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9sd= (Button) findViewById(R.id.button9sd);
        button9sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Sinhgad";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_sinhgad.this,"Added as favourite",Toast.LENGTH_SHORT).show();
            }

        });

    }

    public Button button7sd;
    public void init4() {
        button7sd = (Button) findViewById(R.id.button7sd);
        button7sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_sinhgad.this, map_sinh.class);
                startActivity(toy4);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_sinhgad);
        init();
        init5();
        init4();

    }

}
