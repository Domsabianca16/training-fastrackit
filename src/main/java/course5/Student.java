package course5;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Human {
    public static void main(String[] args) {
        Student s = new Student();
        s.setFirstName("Ana");
        s.setLastName("Sam");
        s.setBirthDate(LocalDate.of(2000,5,11));
        System.out.println(s.toString());
        Student s2 = new Student();
        s2.setFirstName("Ana");
        s2.setLastName("Sam");
        s2.setBirthDate(LocalDate.of(2000,5,11));
        System.out.println(s2.toString());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.equals(s2));
    }
    public String toString(){
        return "First Name: " + getFirstName()
                + " Last Name: " + getLastName()
                + " Birth Date: " + getBirthDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(birthDate, student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }

    String firstName;
    String lastName;
    LocalDate birthDate;
    LocalDate dateOfEnrollment;
    String facultyName;
    String specializationName;
    String type;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
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


}
