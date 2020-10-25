package com.example.kpa_bead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn_ko,btn_papir,btn_ollo;
    ImageView sajat,elenfel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ko = (Button) findViewById(R.id.btn_ko);
        btn_papir = (Button) findViewById(R.id.btn_papir);
        btn_ollo = (Button) findViewById(R.id.btn_ollo);

        sajat = (ImageView) findViewById(R.id.sajat);
        elenfel = (ImageView) findViewById(R.id.elenfel);

        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.rock);
            }
        });
        btn_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.paper);
            }
        });
        btn_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.scissors);
            }
        });

    }
}