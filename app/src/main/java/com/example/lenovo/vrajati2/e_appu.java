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

public class e_appu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_appu);
        init();
        init4();
        init5();
    }


    public Button button8ea;
    public void init()
    {
        button8ea= (Button)findViewById(R.id.button8ea);
        button8ea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.appugharpune.com");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });

    }




    public Button button7ea;
    public void init4() {
        button7ea = (Button) findViewById(R.id.button7ea);
        button7ea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(e_appu.this, map_appu.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9ea;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9ea= (Button) findViewById(R.id.button9ea);
        button9ea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Appu Ghar";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(e_appu.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


}
