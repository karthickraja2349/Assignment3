package com.assignment3;
public class BottleSong {

    public static void main(String[] args) {
        reciteBottlesSong(10);
    }

    public static void reciteBottlesSong(int start) {
        for (int bottles = start; bottles > 0; bottles--) {
            String currentBottles = bottles + " green bottles";
            String nextBottles = (bottles - 1 > 0) ? (bottles - 1 + " green bottles") : "no green bottles";

            System.out.println(currentBottles + " hanging on the wall,");
            System.out.println(currentBottles + " hanging on the wall,");
            System.out.println("And if one green bottle should accidentally fall,");
            System.out.println("There'll be " + nextBottles + " hanging on the wall.\n");
        }
    }
}
