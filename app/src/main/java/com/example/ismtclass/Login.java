package com.example.ismtclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button login_btn;
    TextView forgot_txt,txt_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent=new Intent(Login.this,MainActivity.class);
                startActivity(loginIntent);
            }
        });
        forgot_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotIntent=new Intent(Login.this,ForgotPassword.class);
                startActivity(forgotIntent);
            }
        });

    }
    public void init(){
        login_btn=findViewById(R.id.btn_login);
        forgot_txt=findViewById(R.id.txt_forgot);
        txt_signup=findViewById(R.id.txt_signup);
    }
}