package com.assignment3;
import java.util.Arrays;
import java.util.List;

public class ResistorColour {

    private static final List<String> COLORS = Arrays.asList(
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    );

    public static int colorCode(String color) {
        return COLORS.indexOf(color.toLowerCase());
    }

    public static List<String> colors() {
        return COLORS;
    }

    public static void main(String[] args) {
        String color = "yellow";
        System.out.println("The value of " + color + " is: " + colorCode(color));

        System.out.println("List of colors and their values:");
        for (String c : colors()) {
            System.out.println(c + ": " + colorCode(c));
        }
    }
}
