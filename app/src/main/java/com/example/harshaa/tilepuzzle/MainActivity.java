package com.example.harshaa.tilepuzzle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*Button b00;
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
    Button b33;*/
    Button[][] b = new Button[4][4];
    Button newGame;
    Button blackSpot;

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


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j].setText(Integer.toString(thisGame.getBoardAt(i, j)));
                b[i][j].setBackgroundColor(Color.WHITE);
                b[i][j].setTextSize(25);
            }
        }
        b[3][3].setText(Integer.toString(0));
        b[3][3].setBackgroundColor(Color.BLACK);
        b[3][3].setTextColor(Color.WHITE);

        b[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisGame.canSwitchTile(0,0)) {
                    b[0][0].setText("0");
                    b[0][0].setTextColor(Color.WHITE);
                    b[0][0].setBackgroundColor(Color.BLACK);
                    int bx = thisGame.getBlackPieceX();
                    int by = thisGame.getBlackPieceY();
                    b[bx][by].setBackgroundColor(Color.WHITE);
                    b[bx][by].setTextColor(Color.BLACK);
                    b[bx][by].setText(Integer.toString(thisGame.switchTile(0, 0)));
                    if (thisGame.check()) {
                        
                    }
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
                }

            }
        });

        /*b01 = findViewById(R.id.b01);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b01.setText("1");
                b01.setBackgroundColor(Color.RED);
            }
        });
        b02 = findViewById(R.id.b02);
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b02.setText("1");
                b02.setBackgroundColor(Color.RED);
            }
        });
        b03 = findViewById(R.id.b03);
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b03.setText("1");
                b03.setBackgroundColor(Color.RED);
            }
        });
        b10 = findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setText("1");
                b10.setBackgroundColor(Color.RED);
            }
        });
        b11 = findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setText("1");
                b11.setBackgroundColor(Color.RED);
            }
        });
        b12 = findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setText("1");
                b12.setBackgroundColor(Color.RED);
            }
        });
        b13 = findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setText("1");
                b13.setBackgroundColor(Color.RED);
            }
        });
        b20 = findViewById(R.id.b20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b20.setText("1");
                b20.setBackgroundColor(Color.RED);
            }
        });
        b21 = findViewById(R.id.b21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b21.setText("1");
                b21.setBackgroundColor(Color.RED);
            }
        });
        b22 = findViewById(R.id.b22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b22.setText("1");
                b22.setBackgroundColor(Color.RED);
            }
        });
        b23 = findViewById(R.id.b23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b23.setText("1");
                b23.setBackgroundColor(Color.RED);
            }
        });
        b30 = findViewById(R.id.b30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b30.setText("1");
                b30.setBackgroundColor(Color.RED);
            }
        });
        b31 = findViewById(R.id.b31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b31.setText("1");
                b31.setBackgroundColor(Color.RED);
            }
        });
        b32 = findViewById(R.id.b32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b32.setText("1");
                b32.setBackgroundColor(Color.RED);
            }
        });
        b33 = findViewById(R.id.b33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b33.setText("1");
                b33.setBackgroundColor(Color.RED);
            }
        });

        newGame = findViewById(R.id.newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b00.setBackgroundColor(Color.GRAY);
                b01.setBackgroundColor(Color.GRAY);
                b02.setBackgroundColor(Color.GRAY);
                b03.setBackgroundColor(Color.GRAY);
                b10.setBackgroundColor(Color.GRAY);
                b11.setBackgroundColor(Color.GRAY);
                b12.setBackgroundColor(Color.GRAY);
                b13.setBackgroundColor(Color.GRAY);
                b20.setBackgroundColor(Color.GRAY);
                b21.setBackgroundColor(Color.GRAY);
                b22.setBackgroundColor(Color.GRAY);
                b23.setBackgroundColor(Color.GRAY);
                b30.setBackgroundColor(Color.GRAY);
                b31.setBackgroundColor(Color.GRAY);
                b32.setBackgroundColor(Color.GRAY);
                b33.setBackgroundColor(Color.GRAY);
                b00.setText("0");
                b01.setText("0");
                b02.setText("0");
                b03.setText("0");
                b10.setText("0");
                b11.setText("0");
                b12.setText("0");
                b13.setText("0");
                b20.setText("0");
                b21.setText("0");
                b22.setText("0");
                b23.setText("0");
                b30.setText("0");
                b31.setText("0");
                b32.setText("0");
                b33.setText("0");
            }
        });*/


    }
}
