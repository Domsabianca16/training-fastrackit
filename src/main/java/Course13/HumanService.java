package Main.java.Course9;

import Main.java.course5.*;

import java.time.LocalDate;
import java.util.UUID;

public class HumanService {

    public HumanService(HumanRepository<Student> studentRepositoryToInject,
                        HumanRepository<Professor> professorRepositoryToInject) {}

    // method that adds a human in a repository
    public static void exercise1(HumanRepository<Student> studentrep){
        Student s1 = new Student("Karl", "Smith", LocalDate.of(2000, 4, 23), LocalDate.of(2024, 2, 10), "ETTI", "engineer", StudentType.BACHELOR, UUID.fromString("aee05e33-f8c6-445b-860b-815f9df9b90c"));
        Student s2 = new Student("Maya", "Forbes", LocalDate.of(1976, 10, 5), LocalDate.of(2003, 5, 6), "FSEGA", "IE", StudentType.PHD, UUID.fromString("bde05e33-f9c6-445b-860b-815f9df9b90c"));
        Student s3 = new Student("Tyler", "Charles", LocalDate.of(2000, 4, 3), LocalDate.of(2020, 8, 19), "UMFCD", "neurosurgery", StudentType.PHD, UUID.fromString("e2f8c9b1-68d7-4f40-9f6e-4b0b6c02a9a4"));

        studentrep.add(s1);
        studentrep.add(s2);
        studentrep.add(s3);

    }
    // method that prints all humans from the repository
    public static void exercise2(HumanRepository<Student> studentrep2){
        System.out.println("\nStudent repository:\n");
        studentrep2.getAll();
    }

    public static void exercise3(HumanRepository<Student> studentrep2){
        Student s4 = new Student("Chris", "Gabs", LocalDate.of(2001, 7, 8), LocalDate.of(2021, 9, 5), "Harvard", "engineer", StudentType.BACHELOR, UUID.fromString("a7e4d3b1-9c8f-42a1-86a7-0e7a3a1d4b9b"));
        Student s1 = new Student("Karl", "Smith", LocalDate.of(2000, 4, 23), LocalDate.of(2024, 2, 10), "ETTI", "engineer", StudentType.BACHELOR, UUID.fromString("aee05e33-f8c6-445b-860b-815f9df9b90c"));
        System.out.println("\nFirs student updated by id:\n");
        studentrep2.updateById("aee05e33-f8c6-445b-860b-815f9df9b90c", s4);
    }

    public static void exercise4(HumanRepository<Student> studentrep3){
        Student s1 = new Student("Karl", "Smith", LocalDate.of(2000, 4, 23), LocalDate.of(2024, 2, 10), "ETTI", "engineer", StudentType.BACHELOR, UUID.fromString("aee05e33-f8c6-445b-860b-815f9df9b90c"));
        Student s2 = new Student("Maya", "Forbes", LocalDate.of(1976, 10, 5), LocalDate.of(2003, 5, 6), "FSEGA", "IE", StudentType.PHD, UUID.fromString("bde05e33-f9c6-445b-860b-815f9df9b90c"));
        Student s3 = new Student("Tyler", "Charles", LocalDate.of(2000, 4, 3), LocalDate.of(2020, 8, 19), "UMFCD", "neurosurgery", StudentType.PHD, UUID.fromString("e2f8c9b1-68d7-4f40-9f6e-4b0b6c02a9a4"));
        studentrep3.add(s1);
        studentrep3.add(s2);
        studentrep3.add(s3);
        System.out.println("\nThe student repository after deleting 2 students: \n");
        studentrep3.deleteById("aee05e33-f8c6-445b-860b-815f9df9b90c");
        studentrep3.deleteById("bde05e33-f9c6-445b-860b-815f9df9b90c");
        studentrep3.getAll();
    }

    public static void exercise5(HumanRepository<Student> studentrep4){
        Student s3 = new Student("Tyler", "Charles", LocalDate.of(2000, 4, 3), LocalDate.of(2020, 8, 19), "UMFCD", "neurosurgery", StudentType.PHD, UUID.fromString("e2f8c9b1-68d7-4f40-9f6e-4b0b6c02a9a4"));
        studentrep4.add(s3);
        System.out.println("\nPrinting a student by name: \n");
        studentrep4.getAllByName("Tyler");
    }



}
