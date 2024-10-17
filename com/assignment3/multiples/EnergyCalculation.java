package com.assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class EnergyCalculation {
    private BufferedReader reader;
    private PrintWriter writer;

    public EnergyCalculation() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out, true);
    }

    public void calculateEnergy() {
        int level = getLevel();
        int[] baseValues = getBaseValues();

        int totalEnergy = calculateEnergyPoints(level, baseValues);
        writer.println("Total Energy: " + totalEnergy);
        writer.flush();
    }

    private int getLevel() {
        while (true) {
            try {
                writer.print("Enter the level: ");
                writer.flush();
                return Integer.parseInt(reader.readLine());
            } 
            catch (IOException | NumberFormatException e) {
                writer.println("Invalid input: " + e.getMessage());
                writer.flush();
            }
        }
    }

    private int[] getBaseValues() {
        while (true) {
            try {
                writer.print("Enter the base values (comma-separated): ");
                writer.flush();
                String[] input = reader.readLine().split(",");
                int[] baseValues = new int[input.length];
                for (int i = 0; i < input.length; i++) 
                    baseValues[i] = Integer.parseInt(input[i].trim());
                return baseValues;
            } 
            catch (IOException | NumberFormatException e) {
                writer.println("Invalid input: " + e.getMessage());
                writer.flush();
            }
        }
    }

    private int calculateEnergyPoints(int level, int baseValues[]) {
        Set<Integer> uniqueEnergySet = new HashSet<>();

        for (int base : baseValues) {
            for (int multiple = base; multiple < level; multiple += base) {
                uniqueEnergySet.add(multiple);
            }
        }

        int totalEnergy = 0;
        for (int energy : uniqueEnergySet) {
            totalEnergy += energy;
        }
        return totalEnergy;
    }
}
