package com.example.harshaa.tilepuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b00;
    Button b01;
    Button b02;
    Button b03;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b30;
    Button b31;
    Button b32;
    Button b33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b00 = findViewById(R.id.b00);
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b00.setText("1");
            }
        });
        b01 = findViewById(R.id.b01);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b01.setText("1");
            }
        });
        b02 = findViewById(R.id.b02);
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b02.setText("1");
            }
        });
        b03 = findViewById(R.id.b03);
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b03.setText("1");
            }
        });
        b10 = findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setText("1");
            }
        });
        b11 = findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setText("1");
            }
        });
        b12 = findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setText("1");
            }
        });
        b13 = findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setText("1");
            }
        });
        b20 = findViewById(R.id.b20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b20.setText("1");
            }
        });
        b21 = findViewById(R.id.b21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b21.setText("1");
            }
        });
        b22 = findViewById(R.id.b22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b22.setText("1");
            }
        });
        b23 = findViewById(R.id.b23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b23.setText("1");
            }
        });
        b30 = findViewById(R.id.b30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b30.setText("1");
            }
        });
        b31 = findViewById(R.id.b31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b31.setText("1");
            }
        });
        b32 = findViewById(R.id.b32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b32.setText("1");
            }
        });
        b33 = findViewById(R.id.b33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b33.setText("1");
            }
        });

    }

}
