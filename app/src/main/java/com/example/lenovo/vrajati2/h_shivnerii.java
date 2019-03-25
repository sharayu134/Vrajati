package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//button7s

public class h_shivnerii extends AppCompatActivity {

    public Button button7s;
    public void init4() {
        button7s = (Button) findViewById(R.id.button7s);
        button7s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(h_shivnerii.this, mapshani.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9s;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;
    public void init5() {

//        myref = FirebaseDatabase.getInstance().getReference("Users");
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9s= (Button) findViewById(R.id.button9s);
        button9s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Shivneri";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_shivnerii.this,"Added as favourite",Toast.LENGTH_SHORT).show();
            }

        });

    }


    public Button button8s;
    public void init()
    {
        button8s= (Button)findViewById(R.id.button8s);
        button8s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Shivneri");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }



@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_shivnerii);
        init4();
        init();
        init5();
        }
}
