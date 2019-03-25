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

public class t_iskcon extends AppCompatActivity
{
    public Button button8ii;
    public void init()
    {
        button8ii= (Button)findViewById(R.id.button8ii);
        button8ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Hindu_temples_in_Pune");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public Button button7ii;
    public void init4() {
        button7ii = (Button) findViewById(R.id.button7ii);
        button7ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_iskcon.this, map_iskon.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9ii;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9ii= (Button) findViewById(R.id.button9ii);
        button9ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Iskcon Temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_iskcon.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_iskcon);
        init();
        init5();
        init4();
    }

}
