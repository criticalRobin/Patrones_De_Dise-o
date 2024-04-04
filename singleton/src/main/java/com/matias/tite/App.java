package com.matias.tite;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Student studentA = Student.getSingletonInstance("Matias", "Tite", "FISEI");

        System.out.println(studentA.toString());

        Student studentB = Student.getSingletonInstance("Juan", "Perez", "FISEI");
        System.out.println(studentB.toString());
    }
}
