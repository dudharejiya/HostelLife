package com.example.hostellife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class loginForm extends AppCompatActivity {
    Button loginBTN;
    EditText email,password;
    TextView error1TV, error2TV;
    ImageView eyeBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        getSupportActionBar().hide();

        loginBTN = findViewById(R.id.signIn_btn_ID);
        email = findViewById(R.id.signIn_email_ID);
        password = findViewById(R.id.signIn_password_ID);
        error1TV = findViewById(R.id.invalidEmail);
        error2TV = findViewById(R.id.invalidPassword);
        eyeBTN  = findViewById(R.id.password_hide_icon_ID);

        eyeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password.setTransformationMethod(null);

            }
        });


        String verifyEmail = email.getText().toString();
        String verifyPass = password.getText().toString();
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((email.getText().toString()) == "aaftab")
                {
                    if (verifyPass.equals("hardik@1234"))
                    {
                        email.setText("");
                        password.setText("");
                        Toast.makeText(loginForm.this, "Login successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                    else{
                        password.setText("");
                        Toast.makeText(loginForm.this, "Password wrong ", Toast.LENGTH_SHORT).show();
                        error2TV.setText("Wrong Password..! Try Again");
                    }
                }
                else {
                    Toast.makeText(loginForm.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    email.setText("");
//                    error1TV.setText("Please input valid email or number");
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            }
        });
    }
}