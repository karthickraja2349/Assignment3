package com.assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TicTacToe {
    private BufferedReader reader;
    private PrintWriter writer;
    private String[] gameBoard;
    private String player;
    private String winner;
    private static TicTacToe game = null;

    private TicTacToe(PrintWriter writer) {
        this.writer = writer;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static TicTacToe getGameInstance(PrintWriter writer) {
        if (game == null) {
            game = new TicTacToe(writer);
        }
        return game;
    }

    public String getPlayer() {
        return player;
    }

    public String getWinner() {
        return winner;
    }

    public String[] getGameBoard() {
        return gameBoard;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setGameBoard(int range) {
        this.gameBoard = new String[range];
        for (int i = 0; i < range; i++) {
            gameBoard[i] = String.valueOf(i + 1);
        }
    }

    public void showBoard() {
        writer.println("$$$$$$$$");
        writer.println("|" + gameBoard[0] + "|" + gameBoard[1] + "|" + gameBoard[2] + "|");
        writer.println("|" + gameBoard[3] + "|" + gameBoard[4] + "|" + gameBoard[5] + "|");
        writer.println("|" + gameBoard[6] + "|" + gameBoard[7] + "|" + gameBoard[8] + "|");
        writer.println("$$$$$$$$");
        writer.flush();
    }

    private String checkPattern(int point1, int point2, int point3) {
        return gameBoard[point1] + gameBoard[point2] + gameBoard[point3];
    }

    private void victory() {
        for (int i = 0; i < 8; i++) {
            String check = null;
            switch (i) {
                case 0: check = checkPattern(0, 1, 2); break;
                case 1: check = checkPattern(3, 4, 5); break;
                case 2: check = checkPattern(6, 7, 8); break;
                case 3: check = checkPattern(0, 3, 6); break;
                case 4: check = checkPattern(1, 4, 7); break;
                case 5: check = checkPattern(2, 5, 8); break;
                case 6: check = checkPattern(0, 4, 8); break;
                case 7: check = checkPattern(2, 4, 6); break;
            }
            if (check.equalsIgnoreCase("XXX")) {
                setWinner("x");
                return;
            } 
            else if (check.equalsIgnoreCase("OOO")) {
                setWinner("o");
                return;
            }
        }
        for (int i = 0; i < gameBoard.length; i++) {
            if (Arrays.asList(gameBoard).contains(String.valueOf(i + 1))) 
                break;
            else if (i == 8) {
                setWinner("Tie");
                return;
            }
        }
        writer.println("It's " + getPlayer() + "'s chance:");
        writer.flush();
        setWinner(null);
    }

    public void letsGo() {
        while (getWinner() == null) {
            writer.print("Enter your move (1-9): ");
            writer.flush();
            try {
                int userInput = Integer.parseInt(reader.readLine());

                if (userInput > 0 && userInput <= 9) {
                    if (getGameBoard()[userInput - 1].equals(String.valueOf(userInput))) {
                        getGameBoard()[userInput - 1] = getPlayer();
                        showBoard();
                        setPlayer(getPlayer().equals("x") ? "o" : "x");
                        victory();
                    }
                    else {
                        writer.println("Slot already taken. Enter next slot:");
                        writer.flush();
                    }
                }
                else {
                    writer.println("Invalid input. Please enter a number between 1 and 9.");
                    writer.flush();
                }
            } 
            catch (NumberFormatException e) {
                writer.println("Invalid number format. Please enter a valid number.");
                writer.flush();
            } 
            catch (IOException e) {
                writer.println("An error occurred while reading input: " + e.getMessage());
                writer.flush();
            }
        }

        if (getWinner().equals("Tie")) {
            writer.println("Game Tie: No winner found.");
        } 
        else {
            writer.println("Congratulations: " + getWinner() + " wins the game.");
        }
    }
}
