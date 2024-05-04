package com.app.config;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ConfigManager confInstanceOne = ConfigManager.getInstance();
        ConfigManager confInstanceTwo = ConfigManager.getInstance();

        System.out.println(confInstanceOne == confInstanceTwo);

        String language = confInstanceOne.getConfig("lenguaje");
        String theme = confInstanceTwo.getConfig("tema");
        String font = confInstanceOne.getConfig("fuente");
        String timeZone = confInstanceTwo.getConfig("zonaHoraria");

        System.out.println("Lenguaje: " + language);
        System.out.println("Tema: " + theme);
        System.out.println("Fuente: " + font);
        System.out.println("Zona horaria: " + timeZone);
    }
}
