package com.cg.tictactoe;

import java.util.Arrays;

public class TicTacToe {

    private String[][] grid;// = new String[][];
    private String lastMoveBy = "";

    TicTacToe() {
        grid = new String[3][3];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], "");
        }
    }

    public void start() {
        grid[1][1] = "X";
        lastMoveBy = "one";
    }

    public int getTurn() {
        if (lastMoveBy.equals("one")) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean playerOneMove(int x, int y) {
        if (getTurn() != 1) {
            return false;
        }
        grid[x][y] = "X";
        lastMoveBy = "one";
        return true;
    }

    public boolean playerTwoMove(int x, int y) {
        if (getTurn() != 2) {
            return false;
        }
        grid[x][y] = "O";
        lastMoveBy = "two";
        return true;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

}
