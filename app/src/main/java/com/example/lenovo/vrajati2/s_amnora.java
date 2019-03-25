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

public class s_amnora extends AppCompatActivity {
    public Button button8cssaa;
    public void init()
    {
        button8cssaa= (Button)findViewById(R.id.button8cssaa);
        button8cssaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Amanora_Park_Town");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7cssaa;
    public void init4() {
        button7cssaa = (Button) findViewById(R.id.button7cssaa);
        button7cssaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(s_amnora.this, map_amnora.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9cssaa;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9cssaa= (Button) findViewById(R.id.button9cssaa);
        button9cssaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Amnora Mall";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(s_amnora.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_amnora);
        init();
        init4();
        init5();
    }

}
