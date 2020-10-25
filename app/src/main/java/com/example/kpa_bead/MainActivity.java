package com.example.kpa_bead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btn_ko,btn_papir,btn_ollo;
    ImageView sajat,elenfel;
    int sajatpont,ellenfelpont,dontetlen =0;
    TextView kiir,dont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ko = (Button) findViewById(R.id.btn_ko);
        btn_papir = (Button) findViewById(R.id.btn_papir);
        btn_ollo = (Button) findViewById(R.id.btn_ollo);

        sajat = (ImageView) findViewById(R.id.sajat);
        elenfel = (ImageView) findViewById(R.id.elenfel);
        kiir = (TextView)findViewById(R.id.kiir);
        dont = (TextView) findViewById(R.id.dont);
        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.rock);
                kor("Kő");
                kiir.setText("Eredmény: Ember:"+Integer.toString(sajatpont)+ " Computer:"+Integer.toString(ellenfelpont));
                dont.setText("Döntetlen:"+Integer.toString(dontetlen));
            }
        });
        btn_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.paper);
                kor("Papír");
                kiir.setText("Eredmény: Ember:"+Integer.toString(sajatpont)+ " Computer:"+Integer.toString(ellenfelpont));
                dont.setText("Döntetlen:"+Integer.toString(dontetlen));
            }
        });
        btn_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sajat.setImageResource(R.drawable.scissors);
                kor("Olló");
                kiir.setText("Eredmény: Ember:"+Integer.toString(sajatpont)+ " Computer:"+Integer.toString(ellenfelpont));
                dont.setText("Döntetlen:"+Integer.toString(dontetlen));
            }
        });



    }
        public void kor (String sajat)
         {
             String ellenfel = "";
             Random r = new Random();

             int rnd = r.nextInt(3)+1;

             if (rnd == 1)
             {
                 ellenfel = "Kő";
             }
             else if (rnd == 2 )
             {
                 ellenfel = "Papír";
             }
             else if (rnd == 3 )
             {
                 ellenfel = "Olló";
             }

             if (ellenfel == "Kő")
             {
                 elenfel.setImageResource(R.drawable.rock);
             }
             else if (ellenfel == "Papír")
             {
                 elenfel.setImageResource(R.drawable.paper);
             }
             else if (ellenfel == "Olló")
             {
                 elenfel.setImageResource(R.drawable.scissors);
             }

             if (sajat == ellenfel)
             {
                 dontetlen++;
                 Toast.makeText(this, "Döntetlen.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Kő" && ellenfel == "Olló")
             {
                 sajatpont++;
                 Toast.makeText(this, "Nyertél.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Kő" && ellenfel == "Papír")
             {
                 ellenfelpont++;
                 Toast.makeText(this, "Vesztettél.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Olló" && ellenfel == "Kő")
             {
                 ellenfelpont++;
                 Toast.makeText(this, "Vesztettél.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Olló" && ellenfel == "Papír")
             {
                 sajatpont++;
                 Toast.makeText(this, "Nyertél.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Papír" && ellenfel == "Kő")
             {
                 sajatpont++;
                 Toast.makeText(this, "Nyertél.", Toast.LENGTH_SHORT).show();
             }
             else if (sajat == "Papír" && ellenfel == "Olló")
             {
                 ellenfelpont++;
                 Toast.makeText(this, "Vesztettél.", Toast.LENGTH_SHORT).show();
             }


         }
}