package com.assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KindergartenGarden {
    private static final Map<Character, String> PLANT_NAMES = new HashMap<>() {{
        put('G', "Grass");
        put('C', "Clover");
        put('R', "Radishes");
        put('V', "Violets");
    }};

    private  final List<String> STUDENTS = Arrays.asList(
        "Alice", "Bob", "Charlie", "David", "Eve", "Fred", 
        "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"
    );

    private final String row1;
    private final String row2;

    public KindergartenGarden(String garden) {
        String[] rows = garden.split("\n");
        this.row1 = rows[0];
        this.row2 = rows[1];
    }

    public List<String> getPlants(String student) {
        int index = STUDENTS.indexOf(student);
        int start = index * 2;
        int end = start + 2;

        List<Character> plantCodes = Arrays.asList(
            row1.charAt(start), row1.charAt(start + 1),
            row2.charAt(start), row2.charAt(start + 1)
        );

        List<String> plants = new ArrayList<>();
        for (char code : plantCodes) {
            plants.add(PLANT_NAMES.get(code));
        }

        return plants;
    }

    public static void main(String[] args) {
        String gardenLayout = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
        KindergartenGarden garden = new KindergartenGarden(gardenLayout);

        System.out.println(garden.getPlants("Alice"));
        System.out.println(garden.getPlants("Bob"));
    }
}
