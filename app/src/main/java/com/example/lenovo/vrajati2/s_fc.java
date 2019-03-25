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

public class s_fc extends AppCompatActivity
{
    public Button button8css;
    public void init()
    {
        button8css= (Button)findViewById(R.id.button8css);
        button8css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://shoppinglanes.com/pune/fc-road");
                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7css;
    public void init4() {
        button7css = (Button) findViewById(R.id.button7css);
        button7css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(s_fc.this, map_fc.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9css;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9css= (Button) findViewById(R.id.button9css);
        button9css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="FC Road";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(s_fc.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_fc);
        init();
        init4();
        init5();
    }

}
