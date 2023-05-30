package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button wybierz, but5, but7, but10;
    TextView ilosc_pol_napis;
    int ilosc_min;
    Intent Plansza5, Plansza7, Plansza10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wybierz = (Button) findViewById(R.id.Choose);
        ilosc_pol_napis = (TextView) findViewById(R.id.Ilosc_min);
             Plansza5 = new Intent(getApplicationContext(), Board5.class);
             Plansza7 = new Intent(getApplicationContext(), Board7.class);
             Plansza10 = new Intent(getApplicationContext(), Board10.class);
                but5 = (Button) findViewById(R.id.Ilosc_5);
                but5.setEnabled(true);
                but7 = (Button) findViewById(R.id.Ilosc_7);
                but7.setEnabled(false);
                but10 = (Button) findViewById(R.id.Ilosc_10);
                but10.setEnabled(false);
        if(ilosc_min == 0) {
            wybierz.setEnabled(false);
        }
    }


    public void Select(View view) {
        if(ilosc_min == 5) {
            Plansza5.putExtra("ilosc_min_main", ilosc_min);
            startActivity(Plansza5);
        }
        else if(ilosc_min == 7){
            Plansza7.putExtra("ilosc_min_main", ilosc_min);
            startActivity(Plansza7);
        }

    }

    public void num_10(View view) {
    ilosc_min = 10;
        ilosc_pol_napis.setText("Liczba min: "+ilosc_min);
            wybierz.setEnabled(true);
    }

    public void num_7(View view) {
    ilosc_min = 7;
        ilosc_pol_napis.setText("Liczba min: "+ilosc_min);
            wybierz.setEnabled(true);
    }

    public void num_5(View view) {
    ilosc_min = 5;
        ilosc_pol_napis.setText("Liczba min: "+ilosc_min);
            wybierz.setEnabled(true);
    }
}