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

public class n_bhima extends AppCompatActivity {
    public Button button8bv;
    public void init()
    {
        button8bv= (Button)findViewById(R.id.button8bv);
        button8bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Bhimashankar_Temple");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public Button button7bv;
    public void init4() {
        button7bv = (Button) findViewById(R.id.button7bv);
        button7bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_bhima.this, map_bhima.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9bv;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9bv= (Button) findViewById(R.id.button9bv);
        button9bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Bhimashankar";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_bhima.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_bhima);
        init();
        init5();
        init4();
    }

}
