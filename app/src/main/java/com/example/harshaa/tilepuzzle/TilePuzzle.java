package com.example.harshaa.tilepuzzle;

import java.util.Random;

public class TilePuzzle {
    public final int len = 4;
    private int[][] board = new int[len][len];
    private int[] blackPiece = {len - 1, len - 1};
    private int numbertile = 15;
    int[] tiles = new int[16];
    private Random myst = new Random();

    public TilePuzzle() {
        initializeBoard();
        shuffleBoard();
        while (!isValid()) {
            shuffleBoard();
        }

    }

    public void initializeBoard() {
        int count = 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = count;
                tiles[count - 1] = count;
                count++;
            }
        }
        board[len - 1][len - 1] = 0;
    }

    public boolean canSwitchTile(int x, int y) {
        if (board[x][y] == 0) {
            return false;
        }
        if (Math.abs(x - blackPiece[0]) + Math.abs(y - blackPiece[1]) > 1) {
            return false;
        }
        return true;

    }

    public int switchTile(int x, int y) {
        int trans = board[x][y];
        board[x][y] = 0;
        board[blackPiece[0]][blackPiece[1]] = trans;
        blackPiece[0] = x;
        blackPiece[1] = y;
        return trans;
    }

    public int getBoardAt(int x, int y) {
        return board[x][y];
    }

    public int getBlackPieceX() {
        return blackPiece[0];
    }

    public int getBlackPieceY() {
        return blackPiece[1];
    }

    public void shuffleBoard() {
        for (int i = 0; i < numbertile; i++) {
            tiles[i] = i + 1;
        }
        int a = tiles.length - 1;
        while (a > 1) {
            int s = myst.nextInt(a--);
            int temp = tiles[s];
            tiles[s] = tiles[a];
            tiles[a] = temp;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = tiles[(len * i) + j];
            }
        }
    }
    public boolean check() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != (i * len) + j) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid() {
        int numInversions = 0;
        for (int i = 0; i < tiles.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (tiles[j] > tiles[i]) {
                    numInversions++;
                }
            }
        }
        return numInversions % 2 == 0;
    }
}