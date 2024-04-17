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
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

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

        StringBuilder romano = new StringBuilder();

        int num = number;
        while (num > 0) {
            int llave = mapa.floorKey(num); 
            String valor = mapa.get(llave);
            romano.append(valor);
            num -= llave;
        }

        return romano.toString();
    }
}
