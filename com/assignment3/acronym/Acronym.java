package com.assignment3.acronym;
public class Acronym {
    public static void main(String[] args) {
        AcronymGenerator generator = new AcronymGenerator();
        InputHandler inputHandler = new InputHandler();

        String phrase = inputHandler.getUserInput();
        
        if (!phrase.isEmpty()) {
            String acronym = generator.generateAcronym(phrase);
            System.out.println("Acronym: " + acronym);
        }
    }
}
