package com.assignment3.pangram;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean isPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }
}
