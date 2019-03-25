package com.example.lenovo.vrajati2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {
    private EditText emailloginno, passlogin;
    private Button login;
    private TextView newAcc;
    private FirebaseAuth mAuth;//declare instance of firebase
    //private ProgressBar progressBar2;
    // private DatabaseReference ref;
    // private FirebaseUser firebaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailloginno = findViewById(R.id.emaillogin_id);
        passlogin = findViewById(R.id.passwordlogin_id);
        login = findViewById(R.id.login_id);
        newAcc = findViewById(R.id.newAcc_id);
        mAuth = FirebaseAuth.getInstance();//initialise instance of firebase
        // firebaseUser=mAuth.getCurrentUser();
        newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(login.this, signup.class);
                startActivity(in);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser(v);
            }
        });
    }
    private void loginUser(View view) {
        final String emaillog = emailloginno.getText().toString().trim();
        String passwordlog = passlogin.getText().toString().trim();


        if (emaillog.isEmpty()) {
            emailloginno.setError("Email is required");
            emailloginno.requestFocus();
            return;
        }

        if (passwordlog.isEmpty()) {
            passlogin.setError("Password is required");
            passlogin.requestFocus();
            return;
        }
        final ProgressDialog progressDialog = new ProgressDialog(view.getContext());
        progressDialog.setMessage("Please wait..!!");
        progressDialog.show();

        mAuth.signInWithEmailAndPassword(emaillog,passwordlog).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
//                    String uid = firebaseUser.getUid();
                    // ref = FirebaseDatabase.getInstance().getReference("Data");
                    Intent in = new Intent(login.this,welcome.class);
                    startActivity(in);
                }else {
                    progressDialog.dismiss();
                    Toast.makeText(login.this, "Oops..You don't have an account!!", Toast.LENGTH_LONG).show();
                    progressDialog.setCancelable(true);
                }
            }
        });
    }
}
