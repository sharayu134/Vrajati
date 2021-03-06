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

public class m_darshan extends AppCompatActivity {




   public Button button7dd;
   public void init4() {
       button7dd = (Button) findViewById(R.id.button7dd);
       button7dd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toy4 = new Intent(m_darshan.this, map_darshan.class);
               startActivity(toy4);
           }

       });

   }
    public Button button9dd;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9dd= (Button) findViewById(R.id.button9dd);
        button9dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Darshan Museum";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_darshan.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button8dd;
    public void init()
    {
        button8dd= (Button)findViewById(R.id.button8dd);
        button8dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Darshan_Museum");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_darshan);
        init();
        init5();
        init4();
    }

}
