package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class First {


    public int countOccurrence(ArrayList<String> arrayList, String string) {
        int count = 0;
        for (String counter : arrayList) {
            if (counter.equals(string)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] sourceArray) {
        return new ArrayList<>(Arrays.asList(sourceArray));
    }

    public List<Integer> findUnique(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int y = 0; y < arrayList.size(); y++) {
                if (y != i && Objects.equals(arrayList.get(y), arrayList.get(i))) {
                    arrayList.remove(y);
                }
            }
        }
        return arrayList;
    }


    public List<String> calcOccurrence(ArrayList<String> arrayList) {
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int y = arrayList.size() - 1; y >= 0; y--) {
                if (y != i && Objects.equals(arrayList.get(y), arrayList.get(i))) {
                    count++;
                    arrayList.remove(y);
                }
            }
            resultList.add(arrayList.get(i) + ":" + " " + (count + 1));
        }
        return resultList;
    }

    public List<FindOccurrence> findOccurrence(ArrayList<String> arrayList) {
        List<FindOccurrence> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int y = arrayList.size() - 1; y >= 0; y--) {
                if (y != i && Objects.equals(arrayList.get(y), arrayList.get(i))) {
                    count++;
                    arrayList.remove(y);
                }
            }
            resultList.add(new FindOccurrence(arrayList.get(i), count + 1));
        }
        return resultList;
    }
}
