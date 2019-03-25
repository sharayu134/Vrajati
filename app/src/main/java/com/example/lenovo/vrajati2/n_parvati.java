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

public class n_parvati extends AppCompatActivity
{
    public Button button8pt;
    public void init()
    {
        button8pt= (Button)findViewById(R.id.button8pt);
        button8pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Parvati_Hill");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7pt;
    public void init4() {
        button7pt = (Button) findViewById(R.id.button7pt);
        button7pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_parvati.this, map_parvati.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9pt;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9pt= (Button) findViewById(R.id.button9pt);
        button9pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="parvati";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_parvati.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_parvati);
        init();
        init4();
        init5();
    }

}
