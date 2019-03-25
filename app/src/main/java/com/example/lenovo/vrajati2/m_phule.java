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

public class m_phule extends AppCompatActivity {



   public Button button7ff;
   public void init4() {
       button7ff = (Button) findViewById(R.id.button7ff);
       button7ff.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toy4 = new Intent(m_phule.this, map_phule.class);
               startActivity(toy4);
           }

       });

   }
    public Button button9ff;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;


    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9ff= (Button) findViewById(R.id.button9ff);
        button9ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Phule Museum";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_phule.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    public Button button8ff;
    public void init()
    {
        button8ff= (Button)findViewById(R.id.button8ff);
        button8ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/phule_museum_pune");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_phule);
        init();
        init4();
        init5();
    }
}
