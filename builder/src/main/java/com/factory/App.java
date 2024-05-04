package com.factory;

public class App {
    public static void main(String[] args) {
        Form form = new Form("Form 1", true);
        form.addFields("Field 1");
        form.addFields("Field 2");
        form.addFields("Field 3");

        Form clone = form.clone();
        clone.addTitle("Form 2");
        clone.addFields("Field 4");
        clone.setPublic(false);

        System.out.println(form);
        System.out.println(clone);
    }
}
