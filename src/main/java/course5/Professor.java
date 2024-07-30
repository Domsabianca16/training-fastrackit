package course5;

import java.time.LocalDate;
import java.util.Objects;

public class Professor implements Human {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professor2 = new Professor();
        professor.setFirstName("Ioana");
        professor.setLastName("Murphy");
        professor.setBirthDate(LocalDate.of(2001,6,14));
        professor.setType(ProfessorType.PROFESSOR);
        System.out.println(professor.getType());
        professor2.setFirstName("Ioana");
        professor2.setLastName("Murphy");
        professor2.setBirthDate(LocalDate.of(2001,6,14));
        System.out.println(professor.toString());
        System.out.println(professor2.toString());
        System.out.println(professor.hashCode());
        System.out.println(professor2.hashCode());
        System.out.println(professor.equals(professor2));

    }
    String firstName;
    String lastName;
    LocalDate birthDate;
    LocalDate dateOfHiring;
    String specializationName;
    ProfessorType type;
    public Professor() {
    }
    public String toString(){
        return "First Name: " +  getFirstName()
                + " Last Name: " + getLastName()
                + " Birth Date: " + getBirthDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(birthDate, professor.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }
    public course5.ScholarType getType(){
        return this.type;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setType(ProfessorType type) {
        this.type = type;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static interface ScholarType {
    }
}
