package com.assignment3;
public class PythagoreanTriplet {

    public  void findTriplet(int N) {
        for (int a = 1; a < N / 3; a++) {
            for (int b = a + 1; b < N / 2; b++) {
                int c = N - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("Triplet found: {" + a + ", " + b + ", " + c + "}");
                    return; 
                }
            }
        }
        System.out.println("No triplet found for N = " + N);
    }

    public static void main(String[] args) {
        int N = 1000;
        new PythagoreanTriplet().findTriplet(N);
    }
}
