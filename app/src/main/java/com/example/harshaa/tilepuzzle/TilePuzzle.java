package com.example.harshaa.tilepuzzle;
public class TilePuzzle {
    public final int len = 4;
    private int[][] board = new int[len][len];
    private int[] blackPiece = {len - 1, len - 1};

    public TilePuzzle() {
        initializeBoard();

    }

    public void initializeBoard() {
        int count = 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = count;
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
    /*public void shuffleBoard(final int iterations) {
        for (int i = 0; i < iterations; i++) {
            if () {*/
}