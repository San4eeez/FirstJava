package com.example.skoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void submit(View view){
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        String emailStr = email.getText().toString();
        String passwordStr = password.getText().toString();

        Intent intent = new Intent(this, login.class);
        intent.putExtra("email", emailStr);
        intent.putExtra("password", passwordStr);
        startActivity(intent);

    }

    public void openSign(View view){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}