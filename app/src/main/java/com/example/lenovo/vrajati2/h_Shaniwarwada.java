package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class h_Shaniwarwada extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__shaniwarwada);
        init4();
        init();
        init5();
    }


    public Button  button8;
    public void init()
    {
        button8= (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Shaniwar_Wada");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });

    }




   public Button button7;
   public void init4() {
       button7 = (Button) findViewById(R.id.button7);
       button7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toy4 = new Intent(h_Shaniwarwada.this, mapshani.class);
               startActivity(toy4);
           }

       });

   }


    public Button button9;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
       uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9= (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Shaniwarwada";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(h_Shaniwarwada.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


}
