package com.example.skoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        Bundle args = getIntent().getExtras();

        if (args != null) {

            String emailArg = args.getString("email");
            String passwordArg = args.getString("password");

            email.setText(emailArg);
            password.setText(passwordArg);
        }


    }

    public void moveOn(View view){
        Intent intent = new Intent(login.this, Registration.class);
        login.this.startActivity(intent);
    }
}