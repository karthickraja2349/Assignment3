import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {

    public static void main(String[] args) {
        Conversion conversionObj = new Conversion();
        
        ArrayList<String> list = conversionObj.initializeArrayList();
        String[] array = conversionObj.convertToArray(list);
        conversionObj.printArray(array);
        
        ArrayList<String> newList = conversionObj.convertToArrayList(array);
        conversionObj.printArrayList(newList);
    }

    public ArrayList<String> initializeArrayList() {
        return new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
    }

    public String[] convertToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public ArrayList<String> convertToArrayList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public void printArray(String[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void printArrayList(ArrayList<String> list) {
        System.out.println("ArrayList: " + list);
    }
}
