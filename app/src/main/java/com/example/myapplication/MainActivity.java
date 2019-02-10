package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ponidelnik;
    TextView vtornik;
    TextView sreda;
    TextView chetverg;
    TextView patnica;
    TextView subota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ponidelnik = findViewById(R.id.id1);
        vtornik = findViewById(R.id.id2);
        sreda = findViewById(R.id.id3);
        chetverg = findViewById(R.id.id4);
        patnica = findViewById(R.id.id5);
        subota = findViewById(R.id.id6);
        ponidelnik.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 1);
            startActivity(intent);
        });
        vtornik.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 2);
            startActivity(intent);
        });

        sreda.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 3);
            startActivity(intent);
        });

        chetverg.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 4);
            startActivity(intent);
        });

        patnica.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 5);
            startActivity(intent);
        });

        subota.setOnClickListener(v->{
            Intent intent = new Intent(this,DayActivity.class);
            intent.putExtra("day", 6);
            startActivity(intent);
        });



    }
}