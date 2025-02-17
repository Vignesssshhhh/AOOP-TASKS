import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class CadetSortingTest {
    
    // Helper method to check if the list is sorted alphabetically
    private boolean isSorted(List<String> cadets) {
        List<String> sortedList = new ArrayList<>(cadets);
        Collections.sort(sortedList);
        return cadets.equals(sortedList);
    }

    // Test for an empty list
    @Test
    public void testEmptyList() {
        List<String> cadets = new ArrayList<>();
        assertTrue(isSorted(cadets), "An empty list should be considered sorted.");
    }

    // Test for a single cadet
    @Test
    public void testSingleCadet() {
        List<String> cadets = Arrays.asList("Arjun");
        assertTrue(isSorted(cadets), "A single cadet list should be considered sorted.");
    }

    // Test for a list that is already sorted
    @Test
    public void testMultipleCadetsSorted() {
        List<String> cadets = Arrays.asList("Aarav", "Kiran", "Manoj", "Ravi");
        assertTrue(isSorted(cadets), "The list is already sorted alphabetically.");
    }

    // Test for a list that is not sorted
    @Test
    public void testMultipleCadetsUnsorted() {
        List<String> cadets = Arrays.asList("Ravi", "Aarav", "Kiran", "Manoj");
        assertFalse(isSorted(cadets), "The list is not sorted alphabetically.");
    }

    // Test for a list containing identical names but unsorted
    @Test
    public void testCadetsWithIdenticalNames() {
        List<String> cadets = Arrays.asList("Ravi", "Ravi", "Kiran", "Kiran", "Aarav");
        assertFalse(isSorted(cadets), "The list is not sorted even with duplicate names.");
    }
    
    // Test for a sorted list with duplicate names
    @Test
    public void testCadetsWithIdenticalNamesSorted() {
        List<String> cadets = Arrays.asList("Aarav", "Kiran", "Kiran", "Ravi", "Ravi");
        assertTrue(isSorted(cadets), "The list with duplicate names should be sorted correctly.");
    }
}
