package com.example.projekt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Board7 extends AppCompatActivity {
    TextView ilosc_pol_napis_board;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board7);
        ilosc_pol_napis_board = (TextView) findViewById(R.id.Liczba_min_board);
        Intent Plansza = getIntent();
        Bundle Wartosci = Plansza.getExtras();
        int Liczba_min1 = Wartosci.getInt("ilosc_min_main");
        ilosc_pol_napis_board.setText(""+Liczba_min1);

        for(int i = 0; i < Liczba_min1; i++){
            for(int j = 0; j < Liczba_min1; j++){
                //String s = String.valueOf("layout"+i);
                //new LinearLayout s = findViewById(R.id.);
            }
        }
        /*LinearLayout ll = findViewById(R.id.layout);
        Button btn = new Button(this);
        btn.setText(""+Liczba_min1);
        btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        ll.addView(btn);*/


    }
}