package com.matias.tite;

public class Student {
    private String firstName;
    private String lastName;
    private String faculty;

    private static Student student;

    private Student(String firstName, String lastName, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;

        System.out.println("Mi objeto es: " + this.toString());
    }

    private Student() {
    };

    public static Student getSingletonInstance(String firstName, String lastName, String faculty) {
        if (student == null) {
            student = new Student(firstName, lastName, faculty);
        } else {
            System.out.println("Ya existe un objeto de la clase Student");
        }
        return student;
    }

}
