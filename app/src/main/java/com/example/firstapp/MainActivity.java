package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView)  findViewById(R.id.textView);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);

            actualizar();
    }

        private void actualizar(){
            texto.setText(new Date().toString());
        }

        @Override
        public void onClick(View view){
            if (view == boton)
                actualizar();
        }
    }



