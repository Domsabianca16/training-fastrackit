package Main.java.Course13;

import Main.java.Course9.HumanRepository;
import Main.java.Course9.HumanService;
import Main.java.course5.Professor;
import Main.java.course5.Student;

public class InjectionRunner {
    public static void main(String[] args) {
        HumanRepository<Student> studentRepositoryToInject = new HumanRepository<>();
        HumanRepository<Professor> professorRepositoryToInject = new HumanRepository<>();

        HumanService humanService=
                new HumanService(studentRepositoryToInject,professorRepositoryToInject);

    }


}
