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

public class s_fs extends AppCompatActivity {
    public Button button8ccc;
    public void init()
    {
        button8ccc= (Button)findViewById(R.id.button8ccc);
        button8ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://shoppinglanes.com/pune/mg-road");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });
    }


    public Button button7ccc;
    public void init4() {
        button7ccc = (Button) findViewById(R.id.button7ccc);
        button7ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(s_fs.this, map_fs.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9ccc;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9ccc= (Button) findViewById(R.id.button9ccc);
        button9ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Fashion Street";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(s_fs.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_fs);
        init();
        init4();
        init5();
    }

}
