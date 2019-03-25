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

public class n_vetal extends AppCompatActivity {
    public Button button8vt;
    public void init()
    {
        button8vt= (Button)findViewById(R.id.button8vt);
        button8vt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Vetal_Hill");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7vt;
    public void init4() {
        button7vt = (Button) findViewById(R.id.button7vt);
        button7vt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_vetal.this, map_vetal.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9vt;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9vt= (Button) findViewById(R.id.button9vt);
        button9vt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Vetal Hills";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_vetal.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_vetal);
        init();
        init5();
        init4();
    }

}
