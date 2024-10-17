package com.assignment3.acronym;
public class AcronymGenerator {
    public String generateAcronym(String phrase) {
        StringBuilder acronym = new StringBuilder();
        String[] words = phrase.split("[\\s-]+");
        
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        
        return acronym.toString();
    }
}
