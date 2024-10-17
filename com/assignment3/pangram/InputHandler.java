package com.assignment3.pangram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private BufferedReader reader;

    public InputHandler() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getUserInput() {
        try {
            System.err.print("Enter a sentence to check if it's a pangram: ");
            return reader.readLine();
        }
        catch (IOException e) {
            System.err.println("An error occurred while reading input. Please try again.");
            return "";  
        }
    }
}
