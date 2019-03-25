package com.example.lenovo.vrajati2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.vrajati2.Data.UserData;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class xyz extends AppCompatActivity {
EditText textname,mobiletext;
Button addbutton;
String name ,mobile;
DatabaseReference myref;
FirebaseUser firebaseUser;
    UserData userData = new UserData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xyz);
        textname = (EditText)findViewById(R.id.name_id_profile);
        mobiletext = (EditText)findViewById(R.id.mobileno_id_profile);
        addbutton = (Button)findViewById(R.id.btn_add);
        myref = FirebaseDatabase.getInstance().getReference("Users");
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setProfile();
            }
        });
    }
    void setProfile()
    {
        String uid = firebaseUser.getUid();
        String email = firebaseUser.getEmail();
        //String password=firebaseUser.getPassword();
        name = textname.getText().toString();
        mobile = mobiletext.getText().toString();
        //Long mobileno = Long.parseLong(mobile);
        userData.setName(name);
        userData.setMobileno(mobile);
        userData.setMail_id(email);
        myref.child(uid).setValue(userData);
        Intent intent = new Intent(xyz.this,login.class);
        startActivity(intent);
    }
}
