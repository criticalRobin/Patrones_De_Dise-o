package tite.matias;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person pepito = Person.getInstance("Pepito", "Juarez", 15);

        System.out.println(pepito);

        Person juanito = Person.getInstance("Juanito", "Perez", 20);

        System.out.println(juanito);
    }
}
