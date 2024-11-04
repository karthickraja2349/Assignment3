package com.assignment3;
import java.util.HashMap;
import java.util.Map;

public class ResistorColourDuo {

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

    public  int getResistorValue(String colorInput) {
        String[] colors = colorInput.split("-");

        int firstValue = COLOR_MAP.getOrDefault(colors[0], 0);
        int secondValue = colors.length > 1 ? COLOR_MAP.getOrDefault(colors[1], 0) : 0;

        return firstValue * 10 + secondValue;
    }

    public static void main(String[] args) {
        ResistorColourDuo resistorColourDuo = new ResistorColourDuo();
        System.out.println(resistorColourDuo.getResistorValue("brown-green-violet")); 
        System.out.println(resistorColourDuo.getResistorValue("red-orange"));        
        System.out.println(resistorColourDuo.getResistorValue("black"));              
        System.out.println(resistorColourDuo.getResistorValue("yellow-blue"));       
    }
}
