package com.example.roomtest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {

    private static final String TAG = "CreateUserActivity";

    EditText name;
    EditText phone;
    EditText email;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Log.d(TAG, "Create User button is pressed");
        });
    }
}