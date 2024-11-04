package com.assignment3;
public class RaindropSounds {

    public  String convert(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }

       
        if (result.length() == 0) {
            return String.valueOf(number);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        RaindropSounds raindropSounds = new RaindropSounds();
        System.out.println(raindropSounds.convert(28));  
        System.out.println(raindropSounds.convert(30));  
        System.out.println(raindropSounds.convert(34));  
    }
}
