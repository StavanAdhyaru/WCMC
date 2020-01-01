package com.example.practical5_17it002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Login;
    Button Cancel;
    EditText UserName;
    EditText Password;
    TextView OutPut;
    int Count =3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Login = (Button)findViewById(R.id.Login);
    Cancel = (Button)findViewById(R.id.Cancel);
    UserName = (EditText)findViewById(R.id.UserName);
    Password = (EditText)findViewById(R.id.Password);
    OutPut = (TextView)findViewById(R.id.OutPut);



    Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (UserName.getText().toString().equals("Admin") && Password.getText().toString().equals("admin")) {
                OutPut.setText("Login Successful");
                OutPut.setBackgroundColor(Color.GREEN);
            } else {
                if (Count > 0) {
                    OutPut.setText("Login Failed");
                    OutPut.setBackgroundColor(Color.RED);
                    Count--;
                    Toast.makeText(getApplicationContext(), Integer.toString(Count) + " Attempts Remaining", Toast.LENGTH_LONG).show();
                } else {
                    Login.setEnabled(false);
                }
            }
        }
    });
    Cancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
            System.exit(0);
        }
    });


    }
}
