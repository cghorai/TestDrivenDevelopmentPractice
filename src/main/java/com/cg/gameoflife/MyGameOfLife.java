package com.cg.gameoflife;

public class MyGameOfLife {
    private int[][] grid;

    MyGameOfLife(int x, int y) {
        this.grid = new int[x][y];
    }

    public void setStart(int[][] initValues) {
        for (int i = 0; i < initValues.length; i++) {
            int x = initValues[i][0];
            int y = initValues[i][1];
            grid[x][y] = 1;
        }
    }

    public void dieOfUnderOrOverPopulation(int x, int y) {
        if (grid[x][y] == 1) {
            grid[x][y] = 0;
        }
    }

    public void reproduce(int x, int y) {
        if (grid[x][y] == 0) {
            grid[x][y] = 1;
        }
    }

    public int getNeighborCount(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && !(i == x && j == y)) {
                    if (grid[i][j] == 1) {
                        count++;
                    }
                }

            }
        }
        return count;
    }

    public void goToNextGeneration(int x, int y) {

        if (getNeighborCount(x, y) > 3 || getNeighborCount(x, y) < 2) {
            dieOfUnderOrOverPopulation(x, y);
        }

        if (getNeighborCount(x, y) == 3) {
            reproduce(x, y);
        }

    }

    public void play(int generation) {
        for (int k = 0; k < generation; k++) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    goToNextGeneration(i, j);
                }
            }
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }


}
