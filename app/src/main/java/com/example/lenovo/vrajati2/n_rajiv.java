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

public class n_rajiv extends AppCompatActivity {

    Button button8, button7rj,button8rj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_rajiv);
        init();
        init5();
        init4();
    }

    public Button button9rj;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9rj= (Button) findViewById(R.id.button9rj);
        button9rj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Rajiv Gandhi";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_rajiv.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public void init4() {
        button7rj = (Button) findViewById(R.id.button7rj);
        button7rj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_rajiv.this, map_zoo.class);
                startActivity(toy4);
            }

        });

    }

    void init() {

        button8rj= (Button)findViewById(R.id.button8rj);
        button8rj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Rajiv_Gandhi_Zoological_Park");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });

    }
}

