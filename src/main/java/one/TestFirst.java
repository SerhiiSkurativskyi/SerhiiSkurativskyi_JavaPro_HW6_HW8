package one;



import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;



public class TestFirst {
    @Test
    public void testCountOccurrence() {
        First first = new First();
        ArrayList<String> sourceList = new ArrayList<>();
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
        Assert.assertEquals(3, first.countOccurrence(sourceList, sourceString));
    }

    @Test
    public void testToList() {
        Integer[] intArray = {11, 2, 3, 5, 58, 7, 7, 874};
        List<Integer> intList = First.toList(intArray);
        Assert.assertEquals(intList.size(), 8);
        Assert.assertEquals(intList.get(0), Integer.valueOf(11));
        Assert.assertEquals(intList.get(4), Integer.valueOf(58));

        String[] stringArray = {"bot", "boy", "cat", "hat", "map", "dry", "top", "man"};
        List<String> targetList = First.toList(stringArray);
        Assert.assertEquals(targetList.size(), 8);
        Assert.assertEquals(targetList.get(0), String.valueOf("bot"));
        Assert.assertEquals(targetList.get(4), String.valueOf("map"));
    }

    @Test
    public void testFindUnique() {
        First first = new First();
        ArrayList<Integer> sourceList = new ArrayList<Integer>();
        sourceList.add(5);
        sourceList.add(2);
        sourceList.add(2);
        sourceList.add(5);
        sourceList.add(1);
        sourceList.add(4);
        sourceList.add(2);
        sourceList.add(2);
        sourceList.add(7);
        sourceList.add(2);
        sourceList.add(7);
        ArrayList<Integer> targetList = new ArrayList<Integer>();
        targetList.add(5);
        targetList.add(1);
        targetList.add(4);
        targetList.add(2);
        targetList.add(7);
        Assert.assertEquals(targetList, first.findUnique(sourceList));
    }

    @Test
    public void testCalcOccurrence() {
        First first = new First();
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("cat");
        sourceList.add("man");
        sourceList.add("man");
        sourceList.add("dog");
        sourceList.add("dog");
        ArrayList<String> targetList = new ArrayList<>();
        targetList.add("boy: 4");
        targetList.add("cat: 1");
        targetList.add("man: 2");
        targetList.add("dog: 2");
        Assert.assertEquals(targetList, first.calcOccurrence(sourceList));
    }

    @Test
    public void testFindOccurrence() {
        First first = new First();
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("cat");
        sourceList.add("man");
        sourceList.add("man");
        sourceList.add("dog");
        sourceList.add("dog");
        List<FindOccurrence> targetList = new ArrayList<>();
        targetList.add(new FindOccurrence("boy", 4));
        targetList.add(new FindOccurrence("cat", 1));
        targetList.add(new FindOccurrence("man", 2));
        targetList.add(new FindOccurrence("dog", 2));
        List<FindOccurrence> result = new First().findOccurrence(sourceList);
        Assert.assertEquals(targetList.size(), result.size());
        for (int i = 0; i < targetList.size(); i++) {
            Assert.assertEquals(targetList.get(i).getName(), result.get(i).getName());
            Assert.assertEquals(targetList.get(i).getOccurrence(), result.get(i).getOccurrence());
        }
    }
}
