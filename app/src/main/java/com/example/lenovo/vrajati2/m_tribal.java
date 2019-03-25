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

public class m_tribal extends AppCompatActivity {
    public Button button8tt;
    public void init()
    {
        button8tt= (Button)findViewById(R.id.button8tt);
        button8tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Tribal_Research_Institute_Museum");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7tt;
    public void init4() {
        button7tt = (Button) findViewById(R.id.button7tt);
        button7tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(m_tribal.this, map_tribal.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9tt;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9tt= (Button) findViewById(R.id.button9tt);
        button9tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Tribal Muesium";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_tribal.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_tribal);
        init();
        init4();
        init5();
    }

}
