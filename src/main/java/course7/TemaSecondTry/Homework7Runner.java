package course7.TemaSecondTry;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Homework7Runner  {
    public static void main(String[] args) {
        // Collection with unique elements
        HashSet<String> collection = new HashSet<>();
        collection.add("A");
        collection.add("B");
        collection.add("B"); // this won't be printed
        System.out.println("Collection 1: " + collection);

        System.out.println("\nCustom comparator 1 : course number and difficulty level");

        FirstComparator a1 = new FirstComparator(UUID.randomUUID(),1,"C1","HOMEWORK1",DifficultyLevel.EASY);
        FirstComparator a2 = new FirstComparator(UUID.randomUUID(),2,"C2","HOMEWORK2",DifficultyLevel.MEDIUM);
        FirstComparator a3 = new FirstComparator(UUID.randomUUID(),0,"C1","HOMEWORK1",DifficultyLevel.MEDIUM);
        List<FirstComparator> assignments = new ArrayList<>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        System.out.println("Before sorting: "+ assignments);
        Collections.sort(assignments);
        System.out.println("After sorting: "+ assignments);

        System.out.println("\nCustom comparator 2 : course number and assignment title");

        SecondComparator a4 = new SecondComparator(UUID.randomUUID(),4,"C4","HOMEWORK4",DifficultyLevel.EASY);
        SecondComparator a5 = new SecondComparator(UUID.randomUUID(),6,"C6","HOMEWORK6",DifficultyLevel.MEDIUM);
        SecondComparator a6 = new SecondComparator(UUID.randomUUID(),3,"C3","HOMEWORK3",DifficultyLevel.EASY);
        List<SecondComparator> assignments2 = new ArrayList<>();
        assignments2.add(a4);
        assignments2.add(a6);
        assignments2.add(a5);
        System.out.println("Before sorting : "+ assignments2);
        Collections.sort(assignments2);
        System.out.println("After sorting : "+ assignments2);

        HashMap<String,FirstComparator> map = new HashMap<>();
        map.put("A",a1);
        map.put("B",a2);
        map.put("C",a3);
        System.out.println(map);
        System.out.println(map.get("A"));




    }
}
