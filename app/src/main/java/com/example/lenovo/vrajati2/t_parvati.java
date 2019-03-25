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

public class t_parvati extends AppCompatActivity {
    public Button button8cop;
    public void init()
    {
        button8cop= (Button)findViewById(R.id.button8cop);
        button8cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Parvati_Hill");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7cop;
    public void init4() {
        button7cop = (Button) findViewById(R.id.button7cop);
        button7cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_parvati.this, map_t_par.class);
                startActivity(toy4);
            }

        });

    }

    public Button button9cop;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9cop= (Button) findViewById(R.id.button9cop);
        button9cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="parvati temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_parvati.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_parvati);
        init();
        init5();init4();
    }

}
