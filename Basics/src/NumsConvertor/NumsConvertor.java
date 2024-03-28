package NumsConvertor;

import java.util.TreeMap;

public class NumsConvertor {
    private int number;

    public NumsConvertor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String convertToRomanNumber() {
        // Verificar si el número está dentro del rango válido (1 a 3999)
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        // Definir el mapa de equivalencias de números romanos
        TreeMap<Integer, String> mapa = new TreeMap<>();
        mapa.put(1000, "M");
        mapa.put(900, "CM");
        mapa.put(500, "D");
        mapa.put(400, "CD");
        mapa.put(100, "C");
        mapa.put(90, "XC");
        mapa.put(50, "L");
        mapa.put(40, "XL");
        mapa.put(10, "X");
        mapa.put(9, "IX");
        mapa.put(5, "V");
        mapa.put(4, "IV");
        mapa.put(1, "I");

        // Crear un StringBuilder para construir la representación en números romanos
        StringBuilder romano = new StringBuilder();

        // Iterar sobre el mapa para convertir el número
        int num = number;
        while (num > 0) {
            int llave = mapa.floorKey(num); // Encontrar el número más grande en el mapa que sea menor o igual a 'num'
            String valor = mapa.get(llave); // Obtener el valor romano asociado a esa llave
            romano.append(valor); // Agregar el valor romano al resultado
            num -= llave; // Restar el valor actual al número
        }

        return romano.toString(); // Devolver la representación en números romanos
    }
}
