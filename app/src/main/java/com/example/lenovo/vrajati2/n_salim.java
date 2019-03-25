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

public class n_salim extends AppCompatActivity
{
    public Button button8sa;
    public void init()
    {
        button8sa= (Button)findViewById(R.id.button8sa);
        button8sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Salim_Ali_Bird_Sanctuary");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button9sa;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9sa= (Button) findViewById(R.id.button9sa);
        button9sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Salim ali";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_salim.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button7sa;
    public void init4() {
        button7sa = (Button) findViewById(R.id.button7sa);
        button7sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_salim.this, map_salim.class);
                startActivity(toy4);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_salim);
        init();
        init4();
        init5();
    }

}
