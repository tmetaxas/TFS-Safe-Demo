package com.thomasmetaxas.tfssafedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nameLabel;
    TextView lastNameLabel;
    TextView phoneLabel;
    TextView emailLabel;
    TextView userLabel;

    public String fName;
    public String lName;
    public String phone;
    public String email;

    public String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameLabel = findViewById(R.id.nameLabel);
        lastNameLabel = findViewById(R.id.lastNameLabel);
        phoneLabel = findViewById(R.id.emailLabel);
        emailLabel = findViewById(R.id.phoneLabel);
        userLabel = findViewById(R.id.userLabel);

        Bundle extras=getIntent().getExtras();

        if (extras != null) {

            fName = extras.getString("FName");
            lName = extras.getString("LName");
            phone = extras.getString("Phone");
            email = extras.getString("Email");
            user = extras.getString("User");

            nameLabel.setText("Prenom: " + fName);
            lastNameLabel.setText("Nom: " + lName);
            phoneLabel.setText("Telephone: " + phone);
            emailLabel.setText("Courriel: " + email);
            userLabel.setText(user);

        }

    }
}