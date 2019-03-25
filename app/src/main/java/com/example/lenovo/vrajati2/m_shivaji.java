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

public class m_shivaji extends AppCompatActivity
{
    public Button button8sss;
    public void init()
    {
        button8sss= (Button)findViewById(R.id.button8sss);
        button8sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Chhatrapati_Shivaji_Maharaj_Museum_of_Indian_History");
                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }

    public Button button7sss;
    public void init4() {
        button7sss = (Button) findViewById(R.id.button7sss);
        button7sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(m_shivaji.this, map_shivaji.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9sss;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9sss= (Button) findViewById(R.id.button9sss);
        button9sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Chhatrapati Shivaji Maharaj Museum of Indian History";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(m_shivaji.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_shivaji);
        init();
        init4();
        init5();
    }

}
