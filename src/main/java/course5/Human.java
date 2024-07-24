package course5;

import java.time.LocalDate;

public interface Human {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setBirthDate(LocalDate birthDate);
    String getFirstName();
    String getLastName();
    LocalDate getBirthDate();



}
