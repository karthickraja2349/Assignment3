package com.assignment3;
import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {

    public static List<List<Integer>> findCombinations(int sum, int numDigits, List<Integer> constraints) {
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinationsHelper(sum, numDigits, new ArrayList<>(), combinations, constraints, 1);
        return combinations;
    }

    private static void findCombinationsHelper(int targetSum, int numDigits, List<Integer> currentCombination,
                                               List<List<Integer>> combinations, List<Integer> constraints, int start) {
        if (currentCombination.size() == numDigits) {
            if (targetSum == 0) {
                combinations.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (constraints.contains(i)) {
                continue;
            }
            currentCombination.add(i);
            findCombinationsHelper(targetSum - i, numDigits, currentCombination, combinations, constraints, i + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int sum = 10;
        int numDigits = 2;
        List<Integer> constraints = List.of(1, 4);

        List<List<Integer>> combinations = findCombinations(sum, numDigits, constraints);
        System.out.println("Valid combinations: ");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
