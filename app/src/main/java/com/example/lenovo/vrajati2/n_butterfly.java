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

public class n_butterfly extends AppCompatActivity {


    public Button button8bt;
    public void init()
    {
        button8bt= (Button)findViewById(R.id.button8bt);
        button8bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.whatshot.in/pune/papillon-butterfly-park-v-151602");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button9bt;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9bt= (Button) findViewById(R.id.button9bt);
        button9bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="butterfly Park";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_butterfly.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button7bt;
    public void init4() {
        button7bt = (Button) findViewById(R.id.button7bt);
        button7bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_butterfly.this, map_but.class);
                startActivity(toy4);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_butterfly);
        init();
        init4();
        init5();
    }

}
