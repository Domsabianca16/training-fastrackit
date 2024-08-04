package course7.Tema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AssigmentRunner {
    public static void main(String[] args) {
        // Collection with unique elements.
        HashSet<String> collection1 = new HashSet<>();
        collection1.add("A");
        collection1.add("B");
        System.out.println("Collection 1: " + collection1);
        // Sorted collection which orders by a custom Comparator by the course number and difficulty level.
        Assignment a1 = new Assignment(1, "Homework1", "Basic Concepts", DifficultyLevel.EASY);
        Assignment a2 = new Assignment(2, "Homework2", "Git", DifficultyLevel.MEDIUM);
        Assignment a3 = new Assignment(3, "Homework3", "First Class", DifficultyLevel.HARD);
        List<Assignment> assignments = new ArrayList<>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        System.out.println("Before sorting: \n" + assignments);
        //Collections.sort(assignments);
        System.out.println("After sorting: \n" + assignments);
    }




    }


