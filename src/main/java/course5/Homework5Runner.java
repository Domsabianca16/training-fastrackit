package course5;

import java.time.LocalDate;

public class Homework5Runner {
    public static void main(String[] args) {
        Student s1 = new Student();
        Professor prof1 = new Professor();
        s1.setFirstName("Bianca");
        s1.setLastName("Domsa");
        s1.setBirthDate(LocalDate.of(2004, 10, 16));
        printTheStudentType(StudentType.BACHELOR);
        prof1.setFirstName("Razvan");
        prof1.setLastName("Pop");
        prof1.setBirthDate(LocalDate.of(1999, 3, 10));
        printTheProfessorType(ProfessorType.PROFESSOR);
        System.out.println("First Name: " + s1.getFirstName() +
                "\nLast Name: " + s1.getLastName() +
                "\nBirth Date: " + s1.getBirthDate());
        System.out.println("First Name: " + prof1.getFirstName()
                + "\nLast Name: " + prof1.getLastName()
                + "\nBirth Date: " + prof1.getBirthDate());

    }
    public static void printTheStudentType(StudentType studentType) {
        switch (studentType) {
            case BACHELOR:
                System.out.println("Bachelor");
                break;
            case MASTERS:
                System.out.println("Masters");
                break;
            case PHD:
                System.out.println("Phd");
                break;
            default:
                System.out.println("Unknown Student Type");
        }
    }
    public static void printTheProfessorType(ProfessorType professorType) {
        switch (professorType) {
            case ASSISTANT:
                System.out.println("Assistant");
                break;
            case ASSOCIATE:
                System.out.println("Associate");
                break;
            case PROFESSOR:
                System.out.println("Professor");
                break;
            default:
                System.out.println("Unknown Professor");
        }
    }
}
