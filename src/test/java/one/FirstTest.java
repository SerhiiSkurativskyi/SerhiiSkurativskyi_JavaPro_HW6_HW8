package one;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class FirstTest {

    @Test
    public void testCountOccurrence() {
        First first = new First();
        List<String> sourceList = new ArrayList<>();
        sourceList.add("bot");
        sourceList.add("target");
        sourceList.add("boy");
        sourceList.add("man");
        sourceList.add("target");
        sourceList.add("cat");
        sourceList.add("hat");
        sourceList.add("map");
        sourceList.add("man");
        sourceList.add("target");
        sourceList.add("dog");
        sourceList.add("boy");
        sourceList.add("top");
        String sourceString = "target";
        assertEquals(3, first.countOccurrence(sourceList, sourceString));
    }


    @Test
    public void testToList() {
        Integer[] intArray = {11, 2, 3, 5, 58, 7, 7, 874};
        List<Integer> intList = First.toList(intArray);
        assertEquals(intList.size(), 8);
        assertEquals(intList.get(0), Integer.valueOf(11));
        assertEquals(intList.get(4), Integer.valueOf(58));

        String[] stringArray = {"bot", "boy", "cat", "hat", "map", "dry", "top", "man"};
        List<String> targetList = First.toList(stringArray);
        assertEquals(targetList.size(), 8);
        assertEquals(targetList.get(0), String.valueOf("bot"));
        assertEquals(targetList.get(4), String.valueOf("map"));
    }

    @Test
    public void testFindUnique() {
        First first = new First();
        List<Integer> sourceList = Arrays.asList(5, 2, 2, 5, 1, 4, 2, 2, 7, 2, 7);
        List<Integer> targetList = Arrays.asList(5, 2, 1, 4, 7);
        assertEquals(targetList, first.findUnique(sourceList));
    }

    @Test
    public void testCalcOccurrence() {
        First first = new First();
        List<String> sourceList = Arrays.asList("boy", "boy", "boy", "boy", "cat", "man", "man", "dog", "dog");
        List<String> targetList = Arrays.asList("boy: 4", "cat: 1", "man: 2", "dog: 2");
        assertEquals(targetList, first.calcOccurrence(sourceList));
    }

    @Test
    public void testFindOccurrence() {
        ArrayList<String> sourceList = new ArrayList<>(Arrays.asList("boy", "boy", "boy", "boy", "cat", "man", "man", "dog", "dog"));
        List<FindOccurrence> targetList = new ArrayList<>();
        targetList.add(new FindOccurrence("boy", 4));
        targetList.add(new FindOccurrence("cat", 1));
        targetList.add(new FindOccurrence("man", 2));
        targetList.add(new FindOccurrence("dog", 2));
        List<FindOccurrence> result = new First().findOccurrence(sourceList);
        assertEquals(targetList.size(), result.size());
        for (int i = 0; i < targetList.size(); i++) {
            assertEquals(targetList.get(i).getName(), result.get(i).getName());
            assertEquals(targetList.get(i).getOccurrence(), result.get(i).getOccurrence());
        }
    }
}
