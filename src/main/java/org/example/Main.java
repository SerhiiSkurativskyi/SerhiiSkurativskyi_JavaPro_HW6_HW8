package org.example;

import one.First;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     one.First first = new First();
        List<String> sourceList = new ArrayList<>();
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("boy");
        sourceList.add("cat");
        sourceList.add("man");
        sourceList.add("man");
        sourceList.add("dog");
        sourceList.add("dog");
        List<String> targetList = new ArrayList<>();
        targetList.add("boy: 4");
        targetList.add("cat: 1");
        targetList.add("man: 2");
        targetList.add("dog: 2");
        System.out.println(calcOccurrence(sourceList));
    }
   public static List<String> calcOccurrence(List<String> arrayList) {
      List<String> resultList = new ArrayList<>();
      for (String s : arrayList) {
         boolean alreadyExists = false;
         for (String result : resultList) {
            if (result.startsWith(s)) {
               alreadyExists = true;
               break;
            }
         }
         if (!alreadyExists) {
            int count = 0;
            for (String t : arrayList) {
               if (t.equals(s)) {
                  count++;
               }
            }
            resultList.add(s + ": " + count);
         }
      }
      return resultList;
   }
}