package com.cg.tictactoe;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void testGridCreation() {
        TicTacToe board = new TicTacToe();
        Assert.assertNotNull(board);
        Assert.assertEquals(3, board.getGrid().length);
        Assert.assertEquals(3, board.getGrid()[0].length);
    }

    @Test
    public void testStartGame() {
        TicTacToe board = new TicTacToe();
        board.start();
        Assert.assertEquals("X", board.getGrid()[1][1]);
        Assert.assertEquals("", board.getGrid()[0][0]);
        Assert.assertEquals("", board.getGrid()[2][2]);
    }

    @Test
    public void testfindWhoseTurn() {
        TicTacToe board = new TicTacToe();
        board.start();
        Assert.assertEquals(2, board.getTurn());
        board.playerTwoMove(0, 0);
        Assert.assertEquals(1, board.getTurn());
        board.playerOneMove(2, 1);
        Assert.assertEquals(2, board.getTurn());
    }

    @Test
    public void testInvalidMove() {
        TicTacToe board = new TicTacToe();
        board.start();
        board.playerOneMove(2, 1);
        Assert.assertEquals(false, board.playerOneMove(2, 1));
        Assert.assertEquals(2, board.getTurn());
        board.playerTwoMove(2, 1);
        Assert.assertEquals(1, board.getTurn());
        Assert.assertEquals(false, board.playerTwoMove(2, 1));
    }

    public void testFindNextMove() {
        TicTacToe board = new TicTacToe();
        board.start();
    }

}
