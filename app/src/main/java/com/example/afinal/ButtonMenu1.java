package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ButtonMenu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_menu_1);
        init();
    }

        private void init() {
            findViewById(R.id.button_gate_1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ButtonMenu1.this, Gate1.class);
                    startActivity(intent);
                }
            });

            findViewById(R.id.button_gate_2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ButtonMenu1.this, Gate1.class);
                    startActivity(intent);
                }
            });
        }
    }
