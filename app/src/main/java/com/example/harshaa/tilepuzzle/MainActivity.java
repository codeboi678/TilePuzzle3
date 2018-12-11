package com.example.harshaa.tilepuzzle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button[][] b = new Button[4][4];
    Button newGame;
    TextView winText;
    TilePuzzle thisGame = new TilePuzzle();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b[0][0] = findViewById(R.id.b00);
        b[0][1] = findViewById(R.id.b01);
        b[0][2] = findViewById(R.id.b02);
        b[0][3] = findViewById(R.id.b03);
        b[1][0] = findViewById(R.id.b10);
        b[1][1] = findViewById(R.id.b11);
        b[1][2] = findViewById(R.id.b12);
        b[1][3] = findViewById(R.id.b13);
        b[2][0] = findViewById(R.id.b20);
        b[2][1] = findViewById(R.id.b21);
        b[2][2] = findViewById(R.id.b22);
        b[2][3] = findViewById(R.id.b23);
        b[3][0] = findViewById(R.id.b30);
        b[3][1] = findViewById(R.id.b31);
        b[3][2] = findViewById(R.id.b32);
        b[3][3] = findViewById(R.id.b33);
        newGame = findViewById(R.id.newGame);


        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j].setTextSize(25);
                b[i][j].setText(Integer.toString(thisGame.getBoardAt(i, j)));
                b[i][j].setBackgroundColor(Color.WHITE);
            }
        }
        b[3][3].setText(Integer.toString(0));
        b[3][3].setBackgroundColor(Color.BLACK);
        b[3][3].setTextColor(Color.WHITE);

        b[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(0,0)) {
                    //winText.setVisibility(View.VISIBLE);
                    b[0][0].setText("0");
                    b[0][0].setTextColor(Color.WHITE);
                    b[0][0].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(0, 0)));
                }

            }
        });


        b[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(0,1)) {
                    b[0][1].setText("0");
                    b[0][1].setTextColor(Color.WHITE);
                    b[0][1].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(0, 1)));
                }

            }
        });


        b[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(0,2)) {
                    b[0][2].setText("0");
                    b[0][2].setTextColor(Color.WHITE);
                    b[0][2].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(0, 2)));
                }

            }
        });


        b[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(0,3)) {
                    b[0][3].setText("0");
                    b[0][3].setTextColor(Color.WHITE);
                    b[0][3].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(0, 3)));
                }

            }
        });

        b[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(1,0)) {
                    b[1][0].setText("0");
                    b[1][0].setTextColor(Color.WHITE);
                    b[1][0].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(1, 0)));
                }

            }
        });

        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(1,1)) {
                    b[1][1].setText("0");
                    b[1][1].setTextColor(Color.WHITE);
                    b[1][1].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(1, 1)));
                }

            }
        });


        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(1,2)) {
                    b[1][2].setText("0");
                    b[1][2].setTextColor(Color.WHITE);
                    b[1][2].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(1, 2)));
                }

            }
        });

        b[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(1,3)) {
                    b[1][3].setText("0");
                    b[1][3].setTextColor(Color.WHITE);
                    b[1][3].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(1, 3)));
                }

            }
        });


        b[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(2,0)) {
                    b[2][0].setText("0");
                    b[2][0].setTextColor(Color.WHITE);
                    b[2][0].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(2, 0)));
                }

            }
        });


        b[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(2,1)) {
                    b[2][1].setText("0");
                    b[2][1].setTextColor(Color.WHITE);
                    b[2][1].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(2, 1)));
                }

            }
        });


        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(2,2)) {
                    b[2][2].setText("0");
                    b[2][2].setTextColor(Color.WHITE);
                    b[2][2].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(2, 2)));
                }

            }
        });


        b[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(2,3)) {
                    b[2][3].setText("0");
                    b[2][3].setTextColor(Color.WHITE);
                    b[2][3].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(2, 3)));
                }

            }
        });

        b[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(3,0)) {
                    b[3][0].setText("0");
                    b[3][0].setTextColor(Color.WHITE);
                    b[3][0].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(3, 0)));
                }

            }
        });


        b[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(3,1)) {
                    b[3][1].setText("0");
                    b[3][1].setTextColor(Color.WHITE);
                    b[3][1].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(3, 1)));
                }

            }
        });

        b[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(3,2)) {
                    b[3][2].setText("0");
                    b[3][2].setTextColor(Color.WHITE);
                    b[3][2].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(3, 2)));
                }

            }
        });

        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(3,3)) {
                    b[3][3].setText("0");
                    b[3][3].setTextColor(Color.WHITE);
                    b[3][3].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(3, 3)));
                    winText = (TextView) findViewById(R.id.winText);
                    winText.setTextSize(40);
                    winText.setVisibility(View.INVISIBLE);
                    winText.setText("You Won!!!");
                    if (thisGame.check()) {
                        winText.setVisibility(View.VISIBLE);
                    }
                }

            }
        });

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thisGame = new TilePuzzle();
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++) {
                        b[i][j].setTextSize(25);
                        b[i][j].setText(Integer.toString(thisGame.getBoardAt(i, j)));
                        b[i][j].setBackgroundColor(Color.WHITE);
                    }
                }
                b[3][3].setText(Integer.toString(0));
                b[3][3].setBackgroundColor(Color.BLACK);
                winText.setVisibility(View.INVISIBLE);
            }
        });


    }
}
