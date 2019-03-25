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

public class t_trishund extends AppCompatActivity {
    public Button button8coptr;
    public void init()
    {
        button8coptr= (Button)findViewById(R.id.button8coptr);
        button8coptr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://puneheritage.in/trishund-ganapati/");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7coptr;
    public void init4() {
        button7coptr = (Button) findViewById(R.id.button7coptr);
        button7coptr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_trishund.this, map_trishund.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9coptr;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9coptr= (Button) findViewById(R.id.button9coptr);
        button9coptr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Trishund temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_trishund.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_trishund);
        init();
        init5();
        init4();
    }





}
