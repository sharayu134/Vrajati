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

public class h_vishram extends AppCompatActivity {
    public Button button8v;
    public void init()
    {
        button8v= (Button)findViewById(R.id.button8v);
        button8v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Vishrambaug_Wada");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }


    public Button button7v;
    public void init4() {
        button7v = (Button) findViewById(R.id.button7v);
        button7v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_vishram.this, map_vishram.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9v;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9v= (Button) findViewById(R.id.button9v);
        button9v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="VishramBag";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_vishram.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_vishram);
        init();
        init4();
        init5();
    }

}
