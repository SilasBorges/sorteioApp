package com.example.sorteio_0a10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorteio(View view){
        TextView textResult = findViewById(R.id.textResult);

        int x = new Random().nextInt(11);

        textResult.setText("Número: " + x);

    }

}