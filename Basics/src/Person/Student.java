package Person;

import java.time.LocalDate;

public class Student extends Person {
    private String university;
    private String career;
    private int semester;

    public Student(String id, String firstname, String lastname, LocalDate birthdate, String university, String career,
            int semester) {
        super(id, firstname, lastname, birthdate);
        this.university = university;
        this.career = career;
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + this.getFirstname() + " " + this.getLastname() + " y soy estudiante de "
                + this.career + " en la universidad " + this.university;
    }

}
