package course7.TemaSecondTry;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.UUID.randomUUID;

public class Homework7Runner  {
    public static void main(String[] args) {
        // Collection with unique elements
        HashSet<String> collection = new HashSet<>();
        collection.add("A");
        collection.add("B");
        collection.add("B"); // this won't be printed
        System.out.println("Collection 1: " + collection);

        System.out.println("\nCustom comparator 1 : course number and difficulty level");

        FirstComparator a1 = new FirstComparator(randomUUID(),1,"C1","HOMEWORK1",DifficultyLevel.EASY);
        FirstComparator a2 = new FirstComparator(randomUUID(),2,"C2","HOMEWORK2",DifficultyLevel.MEDIUM);
        FirstComparator a3 = new FirstComparator(randomUUID(),0,"C1","HOMEWORK1",DifficultyLevel.MEDIUM);
        List<FirstComparator> assignments = new ArrayList<>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        System.out.println("Before sorting: "+ assignments);
        Collections.sort(assignments);
        System.out.println("After sorting: "+ assignments);

        System.out.println("\nCustom comparator 2 : course number and assignment title");

        SecondComparator a4 = new SecondComparator(randomUUID(),4,"C4","HOMEWORK4",DifficultyLevel.EASY);
        SecondComparator a5 = new SecondComparator(randomUUID(),6,"C6","HOMEWORK6",DifficultyLevel.MEDIUM);
        SecondComparator a6 = new SecondComparator(randomUUID(),3,"C3","HOMEWORK3",DifficultyLevel.EASY);
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

        // HOMEWORK 1 COURSE 8:

        System.out.println("\n Homework 8: ");
        List<Assignment> assignments3 = new ArrayList<>();
        assignments3.add(new Assignment(randomUUID(),8,"C8","HOMEWORK8",DifficultyLevel.EASY));
        assignments3.add(new Assignment(randomUUID(),9,"C9","HOMEWORK9",DifficultyLevel.MEDIUM));
        assignments3.add(new Assignment(randomUUID(),10,"C10","HOMEWORK10",DifficultyLevel.HARD));

        // The elements of the list :

        for(Assignment assignment : assignments3) {
            System.out.println(assignment);
        }
        //1.1 Unique Id s:

        final List<String> uniqueIds = assignments3.stream()
                .map(assignment -> assignment.getId().toString())
                .collect(Collectors.toList());

        System.out.println("\nUnique Id's List:  " + uniqueIds);

        //1.2 Filtered to have only Difficulty Levels easy or medium :

        List<Assignment> filteredListByDiff = assignments3.stream()
               .filter(assignment -> assignment.getLevel().equals(DifficultyLevel.EASY)
                       ||assignment.getLevel().equals(DifficultyLevel.MEDIUM))
               .collect(Collectors.toList());

       System.out.println("\nList sorted by difficulty levels easy and medium: ");

       for(Assignment assignment : filteredListByDiff) {
           System.out.println(assignment);
       }

       //1.3

        System.out.println("\nEach assignment printed : ");
        assignments3.stream().peek(System.out::println)
                .forEach(assignment -> {});

        //1.4  HashMap:

        Map<UUID, Assignment> hashMap =  assignments3.stream()
                .collect(Collectors
                        .toMap(Assignment::getId, Function.identity()));

        hashMap.forEach((uuid, assignment) -> {
            System.out.println("The id : " + uuid + " has the assignment : " + assignment);
                });
























    }
}
