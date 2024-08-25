package Main.java.Course9;

import Main.java.course5.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class HumanService {
    static HumanRepository<Student> studentRepository = new HumanRepository<>();
    static HumanRepository<Professor> professorRepository=new HumanRepository<>();

    public static void main(String[] args) {
        Student s1= new Student("Karl","Smith", LocalDate.of(2000,4,23),LocalDate.of(2024,2,10),"ETTI","engineer", StudentType.BACHELOR, UUID.fromString("aee05e33-f8c6-445b-860b-815f9df9b90c") );
        Student s2=new Student("Maya","Forbes",LocalDate.of(1976,10,5),LocalDate.of(2003,5,6),"FSEGA","IE",StudentType.PHD,UUID.fromString("bde05e33-f9c6-445b-860b-815f9df9b90c"));
        Student s3= new Student("Tyler","Charles",LocalDate.of(2000,4,3),LocalDate.of(2020,8,19),"UMFCD","neurosurgery",StudentType.PHD,UUID.fromString("e2f8c9b1-68d7-4f40-9f6e-4b0b6c02a9a4"));
        Student s4 = new Student("Chris","Gabs",LocalDate.of(2001,7,8),LocalDate.of(2021,9,5),"Harvard","engineer",StudentType.BACHELOR,UUID.fromString("a7e4d3b1-9c8f-42a1-86a7-0e7a3a1d4b9b"));

        Professor p1= new Professor("Alan","Davis",LocalDate.of(1998,8,25),LocalDate.of(1990,3,19),"History", ProfessorType.PROFESSOR,UUID.fromString("fde05e33-f9c6-445b-860b-815f9df9b90c"));
        Professor p2=new Professor("James","Miller",LocalDate.of(1987,9,8),LocalDate.of(2002,9,20),"Math",ProfessorType.ASSISTANT,UUID.fromString("aee05e33-f9c6-445b-860b-815f9df9b90c"));
        Professor p3=new Professor("Jessica","Wilson",LocalDate.of(1995,5,21),LocalDate.of(2024,1,2),"Physics",ProfessorType.ASSOCIATE,UUID.fromString("c8e9f4a2-5b7d-41e0-8a1c-2f7b3a5d9c8e"));
        Professor p4=new Professor("Michael","Gilbert",LocalDate.of(2000,3,4),LocalDate.of(2022,5,3),"Chemistry",ProfessorType.PROFESSOR,UUID.fromString("f4b3e2d1-8a6f-49c0-b5d2-3a9c8f6b1a7d"));

        studentRepository.add(s1);
        studentRepository.add(s2);
        studentRepository.add(s3);
        studentRepository.add(s4);

        professorRepository.add(p1);
        professorRepository.add(p2);
        professorRepository.add(p3);
        professorRepository.add(p4);

        System.out.println("\nStudent repository:\n");
        studentRepository.getAll();
        System.out.println("\nProfessor repository:\n");
        professorRepository.getAll();

        //System.out.println("\nStudents updated by Id:\n");

      //  studentRepository.updateById("e2f8c9b1-68d7-4f40-9f6e-4b0b6c02a9a4",s3);
        //studentRepository.updateById("a7e4d3b1-9c8f-42a1-86a7-0e7a3a1d4b9b",s4);

      //  System.out.println("\nProfessor updated by Id:\n");

     //   professorRepository.updateById("fde05e33-f9c6-445b-860b-815f9df9b90c",p1);
       // professorRepository.updateById("aee05e33-f9c6-445b-860b-815f9df9b90c",p2);

        System.out.println("\nThe student repository after deleting 2 students: \n");

        studentRepository.deleteById("aee05e33-f8c6-445b-860b-815f9df9b90c");
        studentRepository.deleteById("bde05e33-f9c6-445b-860b-815f9df9b90c");

        studentRepository.getAll();

        System.out.println("\nThe professor repository after deleting 2 professors: \n");

        professorRepository.deleteById("c8e9f4a2-5b7d-41e0-8a1c-2f7b3a5d9c8e");
        professorRepository.deleteById("aee05e33-f9c6-445b-860b-815f9df9b90c");

        professorRepository.getAll();

        System.out.println("\nPrinting a student by name: \n");

        studentRepository.getAllByName("Tyler");

        System.out.println("\nPrinting a professor by name: \n");

        professorRepository.getAllByName("Alan");














    }


}
