package com.builder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String query = new QueryBuilder()
                .select("name, age")
                .from("students")
                .where("age > 18")
                .limit(6)
                .offset(10)
                .build();

        System.out.println(query);
    }
}
