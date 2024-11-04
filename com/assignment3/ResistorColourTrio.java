package com.assignment3;
import java.util.HashMap;
import java.util.Map;

public class ResistorColourTrio {

    private static final Map<String, Integer> COLOR_MAP = new HashMap<>();

    static {
        COLOR_MAP.put("black", 0);
        COLOR_MAP.put("brown", 1);
        COLOR_MAP.put("red", 2);
        COLOR_MAP.put("orange", 3);
        COLOR_MAP.put("yellow", 4);
        COLOR_MAP.put("green", 5);
        COLOR_MAP.put("blue", 6);
        COLOR_MAP.put("violet", 7);
        COLOR_MAP.put("grey", 8);
        COLOR_MAP.put("white", 9);
    }

    public  String getResistanceValue(String color1, String color2, String color3) {
        int firstDigit = COLOR_MAP.getOrDefault(color1.toLowerCase(), 0);
        int secondDigit = COLOR_MAP.getOrDefault(color2.toLowerCase(), 0);
        int multiplier = COLOR_MAP.getOrDefault(color3.toLowerCase(), 0);

        int resistanceValue = (firstDigit * 10 + secondDigit) * (int) Math.pow(10, multiplier);

        return formatResistance(resistanceValue);
    }

    private  String formatResistance(int resistanceValue) {
        if (resistanceValue < 1000) {
            return resistanceValue + " ohms";
        } else if (resistanceValue < 1_000_000) {
            return (resistanceValue / 1000.0) + " kiloohms";
        } else {
            return (resistanceValue / 1_000_000.0) + " megaohms";
        }
    }

    public static void main(String[] args) {
        ResistorColourTrio resistorColourTrio = new ResistorColourTrio();
        System.out.println(resistorColourTrio.getResistanceValue("orange", "orange", "black")); 
        System.out.println(resistorColourTrio.getResistanceValue("orange", "orange", "red"));  
        System.out.println(resistorColourTrio.getResistanceValue("orange", "orange", "orange")); 
        System.out.println(resistorColourTrio.getResistanceValue("red", "red", "green"));       
    }
}
