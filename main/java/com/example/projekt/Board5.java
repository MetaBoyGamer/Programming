package com.example.projekt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Board5 extends AppCompatActivity {
    TextView ilosc_pol_napis_board;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board5);
        ilosc_pol_napis_board = (TextView) findViewById(R.id.Liczba_min_board);
        Intent Plansza = getIntent();
        Bundle Wartosci = Plansza.getExtras();
        int Liczba_min1 = Wartosci.getInt("ilosc_min_main");
        //ilosc_pol_napis_board.setText("Pozostało "+Liczba_min1+" min");
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        losowanie();
        /* rand = new Random();
        int miny[] = new int[25];
        int mina_id[] = new int[25];
        for (int i = 0; i < Liczba_min1; i++) {
            miny[i] = rand.nextInt(1);
            mina_id[i] = miny[i];
            int suma = 0;
            for(int j = 0; j < Liczba_min1; j++){
                if(suma < 5 && mina_id[i] == 1){
                    suma++;
                }
                else{
                    break;
                }
                ilosc_pol_napis_board.setText(ilosc_pol_napis_board.getText()+" "+mina_id[i]);
            }

        }*/


        //getString(R.string.liczba) = liczba_min1;

        //GridLayout PlayBoard = new GridLayout(this);

        /*LinearLayout ll = findViewById(R.id.layout);
        Button btn = new Button(this);
        btn.setText(""+Liczba_min1);
        btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        ll.addView(btn);*/

        // buttons[i].SetOnClickListener(this.resID);
    }


    public void losowanie() {
        Random rand = new Random();
        int miny[] = new int[25];
        int[] mina_id = new int[25];
        for (int i = 0; i < 25; i++) {
            miny[i] = rand.nextInt(2);
            mina_id[i] = miny[i];
        }
        int suma = 0;
        for (int j = 0; j < 25; j++) {
            if (suma < 5 && mina_id[j] == 1) {
                suma++;
            } else {
                mina_id[j] = 0;
            }
            // ilosc_pol_napis_board.setText(ilosc_pol_napis_board.getText() + " " + mina_id[j]);
            //String button_id = "button" + j;
        }
        // return mina_id[25];
       /* String button = "button";
        int[] buttons = new int[]{R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16, R.id.button17, R.id.button18, R.id.button19, R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24, R.id.button25};
        for (int i = 1; i <= 25; i++) {
            //int resID = getResources().getIdentifier("button"+i, "id", getPackageName());
            // = new Button[Liczba_min1];
            String button_id = "button" + i;
            int resID = getResources().getIdentifier(button_id, "id", getPackageName());
            Button b = (Button) findViewById(buttons[i]);
            b.setText(mina_id[i]);
        }*/
    }

    public void click(View view) {
        int tab[] = new int[25];

        //String nazwa1 = this.getComponentName().getClassName();
        //String nazwa1 = getReferrer().getAuthority();
        //String nazwa1 = getString(this.getTaskId());
        //@SuppressLint("ResourceType") String nazwa1 = getString(this.getCurrentFocus().getId());
        //String nazwa1 = getCurrentFocus().toString();
        switch (view.getId()) {
            case R.id.button1:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button1));
                button1.setEnabled(false);
                button1.setVisibility(View.INVISIBLE);
                break;
            case R.id.button2:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button2));
                button2.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                tab[1] = 1;
                break;
            case R.id.button3:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button3));
                button3.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                tab[2] = 2;
                break;
            case R.id.button4:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button4));
                button4.setEnabled(false);
                button4.setVisibility(View.INVISIBLE);
                tab[3] = 3;
                break;
            case R.id.button5:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button5));
                button5.setEnabled(false);
                button5.setVisibility(View.INVISIBLE);
                tab[4] = 4;
                break;
            case R.id.button6:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button6));
                button6.setEnabled(false);
                button6.setVisibility(View.INVISIBLE);
                tab[5] = 5;
                break;
            case R.id.button7:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button7));
                button7.setEnabled(false);
                button7.setVisibility(View.INVISIBLE);
                tab[6] = 6;
                break;
            case R.id.button8:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button8));
                button8.setEnabled(false);
                button8.setVisibility(View.INVISIBLE);
                tab[7] = 7;
                break;
            case R.id.button9:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button9));
                button9.setEnabled(false);
                button9.setVisibility(View.INVISIBLE);
                tab[8] = 8;
                break;
            case R.id.button10:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button10));
                button10.setEnabled(false);
                button10.setVisibility(View.INVISIBLE);
                tab[9] = 9;
                break;
            case R.id.button11:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button11));
                button11.setEnabled(false);
                button11.setVisibility(View.INVISIBLE);
                tab[10] = 10;
                break;
            case R.id.button12:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button12));
                button12.setEnabled(false);
                button12.setVisibility(View.INVISIBLE);
                tab[11] = 11;
                break;
            case R.id.button13:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button13));
                button13.setEnabled(false);
                button13.setVisibility(View.INVISIBLE);
                tab[12] = 12;
                break;
            case R.id.button14:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button14));
                button14.setEnabled(false);
                button14.setVisibility(View.INVISIBLE);
                tab[13] = 13;
                break;
            case R.id.button15:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button15));
                button15.setEnabled(false);
                button15.setVisibility(View.INVISIBLE);
                tab[14] = 14;
                break;
            case R.id.button16:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button16));
                button16.setEnabled(false);
                button16.setVisibility(View.INVISIBLE);
                tab[15] = 15;
                break;
            case R.id.button17:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button17));
                button17.setEnabled(false);
                button17.setVisibility(View.INVISIBLE);
                tab[16] = 16;
                break;
            case R.id.button18:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button18));
                button18.setEnabled(false);
                button18.setVisibility(View.INVISIBLE);
                tab[17] = 17;
                break;
            case R.id.button19:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button19));
                button19.setEnabled(false);
                button19.setVisibility(View.INVISIBLE);
                tab[18] = 18;
                break;
            case R.id.button20:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button20));
                button20.setEnabled(false);
                button20.setVisibility(View.INVISIBLE);
                tab[19] = 19;
                break;
            case R.id.button21:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button21));
                button21.setEnabled(false);
                button21.setVisibility(View.INVISIBLE);
                tab[20] = 20;
                break;
            case R.id.button22:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button22));
                button22.setEnabled(false);
                button22.setVisibility(View.INVISIBLE);
                tab[21] = 21;
                break;
            case R.id.button23:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button23));
                button23.setEnabled(false);
                button23.setVisibility(View.INVISIBLE);
                tab[22] = 22;
                break;
            case R.id.button24:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button24));
                button24.setEnabled(false);
                button24.setVisibility(View.INVISIBLE);
                tab[23] = 23;
                break;
            case R.id.button25:
                ilosc_pol_napis_board.setText(String.valueOf(R.id.button25));
                button25.setEnabled(false);
                button25.setVisibility(View.INVISIBLE);
                tab[24] = 24;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }


    }
}