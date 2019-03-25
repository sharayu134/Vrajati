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

public class t_omkareshwar extends AppCompatActivity {
    public Button button8co;
    public void init()
    {
        button8co= (Button)findViewById(R.id.button8co);
        button8co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://www.travelmaharashtra.com/omkareshwar-temple/");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7co;
    public void init4() {
        button7co = (Button) findViewById(R.id.button7co);
        button7co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_omkareshwar.this, map_om.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9co;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9co= (Button) findViewById(R.id.button9co);
        button9co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Omkareshwar temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_omkareshwar.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_omkareshwar);
        init();
        init5();init4();
    }

}
