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

public class t_kasba extends AppCompatActivity {
    public Button button8copk;
    public void init()
    {
        button8copk= (Button)findViewById(R.id.button8copk);
        button8copk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://pmc.gov.in/en/nageshwar-temple");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    public Button button7copk;
    public void init4() {
        button7copk = (Button) findViewById(R.id.button7copk);
        button7copk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(t_kasba.this, map_nageshwar.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9copk;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9copk= (Button) findViewById(R.id.button9copk);
        button9copk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Nageshwar Temple";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(t_kasba.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_kasba);
        init();
        init4();
        init5();
    }

}
