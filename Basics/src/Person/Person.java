package Person;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;

    public Person(String id, String firstname, String lastname, LocalDate birthdate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + this.firstname + " " + this.lastname;
    }

    public int calculateAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(this.birthdate, now);

        return period.getYears();
    }

}
