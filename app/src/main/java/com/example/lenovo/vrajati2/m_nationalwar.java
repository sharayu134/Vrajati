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

public class m_nationalwar extends AppCompatActivity {



   public Button button7nn;
   public void init4() {
       button7nn = (Button) findViewById(R.id.button7nn);
       button7nn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toy4 = new Intent(m_nationalwar.this, map_nat_war.class);
               startActivity(toy4);
           }

       });

   }
    public Button button9nn;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9nn= (Button) findViewById(R.id.button9nn);
        button9nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="National war memorial Museum";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_nationalwar.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    public Button button8nn;
    public void init()
    {
        button8nn= (Button)findViewById(R.id.button8nn);
        button8nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/National_war_memorial_museum");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_nationalwar);
        init();
        init5();
        init4();
    }

}
