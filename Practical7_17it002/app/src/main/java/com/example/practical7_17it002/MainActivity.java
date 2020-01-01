package com.example.practical7_17it002;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.constraint_layout);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.RED:
                this.constraintLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.GREEN:
                this.constraintLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.BLUE:
                this.constraintLayout.setBackgroundColor(Color.BLUE);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return  super.onOptionsItemSelected(item);
    }
}
