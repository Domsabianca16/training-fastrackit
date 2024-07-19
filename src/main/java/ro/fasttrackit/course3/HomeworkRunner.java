package ro.fasttrackit.course3;

import java.time.LocalDate;

public class HomeworkRunner {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setLastName("Domsa");
        prof.setFirstName("Bianca");
        prof.setDateOfBirth(LocalDate.of(2004,10,16));
        prof.setDateOfHiring(LocalDate.of(2024,7,19));
        prof.setEmailAddress("biancadomsa@gmail.com");
        prof.setIsPhd("Software Engineering");
        System.out.println("Last Name: " + prof.getLastName()
                + " First Name: " + prof.getFirstName()
                + " Date of birth:" + prof.getDateOfBirth()
                + " Date of Hiring:" + prof.getDateOfHiring()
                + " Email Address: " + prof.getEmailAddress()
                +" isPhd: " + prof.getIsPhd());



    }
}
