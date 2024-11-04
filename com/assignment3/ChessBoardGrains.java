package com.assignment3;

import java.math.BigInteger;

public class ChessBoardGrains {
    public static long grainsOnSquare(int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("Square must be between 1 and 64");
        }
        
        long grains = 1;
        for (int i = 1; i < square; i++) {
            grains *= 2;
        }
        return grains;
    }

    public static BigInteger totalGrains() {
        BigInteger total = BigInteger.ZERO;
        BigInteger grainsOnCurrentSquare = BigInteger.ONE;
        
        for (int i = 1; i <= 64; i++) {
            total = total.add(grainsOnCurrentSquare);
            grainsOnCurrentSquare = grainsOnCurrentSquare.multiply(BigInteger.TWO);
        }
        
        return total;
    }

    public static void main(String[] args) {
        int square = 1;
        System.out.println("Grains on square " + square + ": " + grainsOnSquare(square));
        System.out.println("Total grains on the chessboard: " + totalGrains());
    }
}

