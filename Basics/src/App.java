import java.time.LocalDate;

import Person.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("1850137918", "Matias", "Tite", LocalDate.of(2003, 11, 14), "UTA",
                "Ingenieria en Software", 5);

        System.out.println(student.toString());
        System.out.println(student.calculateAge());
    }
}
