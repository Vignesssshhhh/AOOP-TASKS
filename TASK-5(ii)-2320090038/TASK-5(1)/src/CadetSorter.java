import java.util.*;

public class CadetSorter {
    
    // Method to sort cadet names alphabetically
    public static List<String> sortCadets(List<String> cadets) {
        List<String> sortedList = new ArrayList<>(cadets);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        List<String> cadets = Arrays.asList("Ravi", "Aarav", "Kiran", "Manoj");
        System.out.println("Original List: " + cadets);
        List<String> sortedCadets = sortCadets(cadets);
        System.out.println("Sorted List: " + sortedCadets);
    }
}
