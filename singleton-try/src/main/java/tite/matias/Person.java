package tite.matias;

public class Person {
    private String name;
    private String lastName;
    private int age;

    private static Person person;

    private Person() {
    }

    private Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        System.out.println("Person created: " + this);
    }

    public static Person getInstance(String name, String lastName, int age) {
        if (person == null) {
            person = new Person(name, lastName, age);
        } else {
            person.name = name;
            person.lastName = lastName;
            person.age = age;
        }
        return person;
    }
}
