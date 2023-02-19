package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class First {


    public int countOccurrence(List<String> arrayList, String string) {
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

    public List<Integer> findUnique(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (Integer integer : arrayList) {
                if (!resultList.contains(integer) && Objects.equals(integer, arrayList.get(i))) {
                    resultList.add(integer);
                }
            }
        }
        return resultList;
    }


    public List<String> calcOccurrence(List<String> arrayList) {
        List<String> resultList = new ArrayList<>();
        for (String arrayListString1 : arrayList) {
            boolean alreadyContains = false;
            for (String result : resultList) {
                if (result.startsWith(arrayListString1)) {
                    alreadyContains = true;
                    break;
                }
            }
            if (!alreadyContains) {
                int count = 0;
                for (String arrayListString2 : arrayList) {
                    if (arrayListString2.equals(arrayListString1)) {
                        count++;
                    }
                }
                resultList.add(arrayListString1 + ": " + count);
            }
        }
        return resultList;
    }

    public List<FindOccurrence> findOccurrence(List<String> arrayList) {
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
