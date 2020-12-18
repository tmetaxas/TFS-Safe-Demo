package com.thomasmetaxas.tfssafedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText nameTextField;
    EditText lastNameTextField;
    EditText emailTextField;
    EditText phoneTextField;

    Button continueButton;

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    public String fName;
    public String lName;
    public String phone;
    public String email;

    public String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextField = findViewById(R.id.nameTextField);
        lastNameTextField = findViewById(R.id.lastNameTextField);
        phoneTextField = findViewById(R.id.phoneTextField);
        emailTextField = findViewById(R.id.emailTextField);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            radioButton = findViewById(checkedId);
                switch(radioButton.getId()) {

                    case R.id.visitorButton:
                        Log.d("RadioButton", "Visiteur");
                        user = "Visiteur";
                        break;

                    case R.id.staffButton:
                        Log.d("RadioButton", "Staff");
                        user = "Staff";
                        break;

                    case R.id.studentButton:
                        Log.d("RadioButton", "Élève");
                        user = "Élève";
                        break;

            }

        }

        });

        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                fName = String.valueOf(nameTextField.getText());
                lName = String.valueOf(lastNameTextField.getText());
                phone = String.valueOf(phoneTextField.getText());
                email = String.valueOf(emailTextField.getText());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("User", user);
                intent.putExtra("FName", fName);
                intent.putExtra("LName", lName);
                intent.putExtra("Phone", phone);
                intent.putExtra("Email", email);
                startActivity(intent);

            }
        });

    }
}