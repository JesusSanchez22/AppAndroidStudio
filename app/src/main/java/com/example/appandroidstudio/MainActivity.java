package com.example.appandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "ccc", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "uuu", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "fff", Toast.LENGTH_SHORT).show();
    }
}