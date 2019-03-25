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

public class e_imagica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_imagica);


    init4();
    init();
    init5();
}


    public Button button8eaii;
    public void init()
    {
        button8eaii= (Button)findViewById(R.id.button8eaii);
        button8eaii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://en.wikipedia.org/wiki/Adlabs_Imagica");

                Intent toy;
                toy = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(toy);
            }

        });

    }




    public Button button7eaii;
    public void init4() {
        button7eaii = (Button) findViewById(R.id.button7eaii);
        button7eaii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(e_imagica.this, map_imagica.class);
                startActivity(toy4);
            }

        });

    }


    public Button button9eaii;
    DatabaseReference myref;
    FirebaseUser firebaseUser;
    String uid;

    public void init5() {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = firebaseUser.getUid();
        myref = FirebaseDatabase.getInstance().getReference("Users").child(uid);

        button9eaii= (Button) findViewById(R.id.button9eaii);
        button9eaii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fav="Imagica";
                myref.child("favorites").push().setValue(fav);
                Toast.makeText(e_imagica.this,"Added as favourite",Toast.LENGTH_SHORT).show();


            }

        });

    }



}
