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

public class s_tulsi extends AppCompatActivity {
    public Button button8csstt;
    public void init()
    {
        button8csstt= (Button)findViewById(R.id.button8csstt);
        button8csstt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://shoppinglanes.com/pune/tulsi-baugh");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_tulsi);
        init();
        init4();
        init5();
    }

    public Button button7csstt;
    public void init4() {
        button7csstt = (Button) findViewById(R.id.button7csstt);
        button7csstt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(s_tulsi.this, map_tulashi.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9csstt;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9csstt= (Button) findViewById(R.id.button9csstt);
        button9csstt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Tulashi Bag";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(s_tulsi.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }


}
