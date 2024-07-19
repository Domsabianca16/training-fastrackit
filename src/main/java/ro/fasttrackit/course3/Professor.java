package ro.fasttrackit.course3;

import java.time.LocalDate;

public class Professor {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring ;
    private String emailAddress;
    private String isPhd;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth( LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIsPhd() {
        return isPhd;
    }

    public void setIsPhd(String isPhd) {
        this.isPhd = isPhd;
    }

    public Professor() {

    }
    public Professor(String ln , String fn , LocalDate dob , LocalDate dh , String email , String phd ){
        lastName = ln;
        firstName = fn;
        dateOfBirth = dob;
        dateOfHiring = dh;
        emailAddress = email;
        isPhd = phd;
    }



}
