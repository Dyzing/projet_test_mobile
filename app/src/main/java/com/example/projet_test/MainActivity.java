package com.example.projet_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bb;

    @Override
    protected void onStart() {
        super.onStart();
        bb = findViewById(R.id.button);
        bb.setOnClickListener(bbbuttonlistener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private View.OnClickListener bbbuttonlistener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Toast.makeText(getApplicationContext(),"agagagaga",Toast.LENGTH_LONG).show();

        }
    };

}