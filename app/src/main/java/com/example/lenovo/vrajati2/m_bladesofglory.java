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

public class m_bladesofglory extends AppCompatActivity {



   public Button button7bb;
   public void init4() {
       button7bb = (Button) findViewById(R.id.button7bb);
       button7bb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toy4 = new Intent(m_bladesofglory.this, map_blades.class);
               startActivity(toy4);
           }

       });

   }

    public Button button9bb;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9bb= (Button) findViewById(R.id.button9bb);
        button9bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Blades og Golry Cricket museum";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_bladesofglory.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


    public Button button8bb;
    public void init()
    {
        button8bb= (Button)findViewById(R.id.button8bb);
        button8bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/bladesofglory cricket museum");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_bladesofglory);
        init();
        init5();
        init4();
    }

}
