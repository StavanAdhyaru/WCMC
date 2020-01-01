package com.example.practical2_D18IT137;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Num1,Num2;
    Button sum,min,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Num1 = (EditText)findViewById(R.id.Num1);
            Num2 = (EditText)findViewById(R.id.Num2);
            sum = (Button)findViewById(R.id.Sum);
            min = (Button)findViewById(R.id.Min);
            mul = (Button)findViewById(R.id.Mul);
            div = (Button)findViewById(R.id.Div);

            sum.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    int num1 = Integer.parseInt(Num1.getText().toString());
                    int num2 = Integer.parseInt(Num2.getText().toString());
                    Toast.makeText(getApplicationContext(),"Sum: "+ Integer.toString(num1+num2),Toast.LENGTH_LONG).show();
                }
            });
            min.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int num1 = Integer.parseInt(Num1.getText().toString());
                int num2 = Integer.parseInt(Num2.getText().toString());
                Toast.makeText(getApplicationContext(),"Minus: "+ Integer.toString(num1-num2),Toast.LENGTH_LONG).show();
            }
        });
            mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int num1 = Integer.parseInt(Num1.getText().toString());
                int num2 = Integer.parseInt(Num2.getText().toString());
                Toast.makeText(getApplicationContext(),"Mul: "+ Integer.toString(num1*num2),Toast.LENGTH_LONG).show();
            }
        });
            div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int num1 = Integer.parseInt(Num1.getText().toString());
                int num2 = Integer.parseInt(Num2.getText().toString());
                if (num2 == 0) {
                    Toast.makeText(getApplicationContext(), "Divison is not possible ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Div: " + Integer.toString(num1 / num2), Toast.LENGTH_LONG).show();
                }
            }
            });

    }
}
