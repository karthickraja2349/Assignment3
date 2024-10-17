package com.assignment3.pangram;
public class Pangram {
    public static void main(String[] args) {
        PangramChecker checker = new PangramChecker();
        InputHandler inputHandler = new InputHandler();
        String sentence = inputHandler.getUserInput();
        if (checker.isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } 
        else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
