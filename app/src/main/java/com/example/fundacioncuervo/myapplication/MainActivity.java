package com.example.fundacioncuervo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextContador, TextMensaje;
    int i = 0;
    boolean control = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      TextMensaje=(TextView)findViewById(R.id.TextMensaje);
        TextContador = (TextView) findViewById(R.id.TextContador);
    }

    public void BTN (View v) {
        if (control){
            i++;
            this.TextContador.setText("" + i);
            if (i==7)
                this.TextMensaje.setText("Ya casi llegamos");
            if (i==8)
                this.TextMensaje.setText("Que Dificil =(");

            if (i==5)
                Log.e("van 5", "vamos bien");

            if (i==9)
                this.TextMensaje.setText("Ya merito");

            if (i==10){
                control = false;
                Log.e("van 5", "vamos bien");
                if (i==10)
                    this.TextMensaje.setText("Por fin");

            }
        }
        else {

            i--;
            this.TextContador.setText("" + i);
            if (i==5)
                Log.e(" van 5", "vamos bien");
            if (i==3)
                this.TextMensaje.setText("Muy bajo");
            if (i==2)
                this.TextMensaje.setText("Bajito");
            if(i==0){
                Log.e(" van 5", "vamos bien");
                control=true;
            }


        }

    }
}
