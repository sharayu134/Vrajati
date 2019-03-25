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

public class m_agakhan extends AppCompatActivity {
    public Button button8aa;
    public void init()
    {
        button8aa= (Button)findViewById(R.id.button8aa);
        button8aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Aga_Khan_Palace");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7aa;
    public void init4() {
        button7aa = (Button) findViewById(R.id.button7aa);
        button7aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(m_agakhan.this, map_aga.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9aa;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9aa= (Button) findViewById(R.id.button9aa);
        button9aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Aga khan Palace";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_agakhan.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_agakhan);
        init();
        init5();
        init4();
    }

}
