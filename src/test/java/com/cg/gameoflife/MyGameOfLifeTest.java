package com.cg.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MyGameOfLifeTest {

    @Test
    public void testCreateGameOfLifeGrid() {
        MyGameOfLife game = new MyGameOfLife(6, 10);
        assertNotNull(game.getGrid());
        assertEquals(6, game.getGrid().length);
        assertEquals(10, game.getGrid()[0].length);
        assertEquals(0, game.getGrid()[0][0]);
    }

    @Test
    public void testInitilizaGameOfLife() {
        MyGameOfLife game = new MyGameOfLife(6, 10);

        int[][] initPosition = {{1, 1}, {1, 2}, {1, 3}};
        game.setStart(initPosition);

        assertEquals(1, game.getGrid()[1][2]);
        assertEquals(0, game.getGrid()[2][2]);

    }

    @Test
    public void testDieOfUnderOrPopulation() {
        MyGameOfLife game = new MyGameOfLife(6, 10);

        int[][] initPosition = {{1, 1}, {1, 2}};
        game.setStart(initPosition);
        game.dieOfUnderOrOverPopulation(1, 1);
        assertEquals(0, game.getGrid()[1][1]);

    }

    @Test
    public void testReproduce() {
        MyGameOfLife game = new MyGameOfLife(6, 10);

        int[][] initPosition = {{1, 1}, {1, 2}, {1, 3}};
        game.setStart(initPosition);
        game.reproduce(0, 2);
        assertEquals(1, game.getGrid()[0][2]);

    }

    @Test
    public void testGetNeighborCount() {
        MyGameOfLife game = new MyGameOfLife(6, 10);
        int[][] initPosition = {{1, 1}, {1, 2}, {1, 3}};
        game.setStart(initPosition);
        assertEquals(1, game.getNeighborCount(1, 1));
        assertEquals(1, game.getNeighborCount(0, 0));
        assertEquals(0, game.getNeighborCount(5, 9));
        assertEquals(3, game.getNeighborCount(0, 2));
        assertEquals(0, game.getNeighborCount(5, 0));
    }

    @Test
    public void testGoToNextGeneration() {
        MyGameOfLife game = new MyGameOfLife(6, 10);
        game.goToNextGeneration(0, 2);
        assertEquals(0, game.getGrid()[0][2]);
        int[][] initPosition = {{1, 1}, {1, 2}, {1, 3}};
        game.setStart(initPosition);
        game.goToNextGeneration(0, 2);
        assertEquals(1, game.getGrid()[0][2]);
        assertEquals(0, game.getGrid()[0][0]);

    }

    @Test
    public void testPlay() {
        MyGameOfLife game = new MyGameOfLife(6, 10);
        int[][] initPosition = {{1, 1}, {1, 2}, {1, 3}};
        game.setStart(initPosition);
        game.play(3);
        assertEquals(1, game.getGrid()[0][2]);

    }
}
