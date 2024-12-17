package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText un,pd;
    Button login;

    String uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        un=(EditText) findViewById(R.id.uname);
        pd=(EditText) findViewById(R.id.pswd);

        login=(Button) findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            int flag=0;
            @Override

            public void onClick(View v) {
                uname=un.getText().toString();
                pwd=pd.getText().toString();
                if (uname.equals("theatre")){
                    if (pwd.equals("12345")){
                        flag=0;
                    }
                    else {
                        flag=1;
                    }
                }
                else {
                    flag=1;
                }
                if (flag==0){
                    Intent login=new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(login);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}