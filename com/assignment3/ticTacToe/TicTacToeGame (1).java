package com.assignment3;
import java.io.PrintWriter;

public class TicTacToeGame {
    public void start() {
        PrintWriter writer = new PrintWriter(System.out, true);
        TicTacToe ticTacToe = TicTacToe.getGameInstance(writer);
        ticTacToe.setGameBoard(9);
        ticTacToe.setPlayer("x");
        
        try {
            ticTacToe.letsGo();
        }
        catch (Exception e) {
            writer.println("An error occurred: " + e.getMessage());
            writer.flush();
        }
    }
}
