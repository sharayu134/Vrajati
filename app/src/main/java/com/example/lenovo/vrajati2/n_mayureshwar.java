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

public class n_mayureshwar extends AppCompatActivity {
    public Button button8mj;
    public void init()
    {
        button8mj= (Button)findViewById(R.id.button8mj);
        button8mj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Mayureshwar_Wildlife_Sanctuary");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button9mj;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9mj= (Button) findViewById(R.id.button9mj);
        button9mj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Mayureshwar";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(n_mayureshwar.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button7mj;
    public void init4() {
        button7mj = (Button) findViewById(R.id.button7mj);
        button7mj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(n_mayureshwar.this, map_mayur.class);
                startActivity(toy4);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_mayureshwar);
        init();
        init4();
        init5();
    }

}
