package com.matias.tite;

import com.matias.tite.factory.shapes.GeometricShape;
import com.matias.tite.factory.shapes.GeometricShapeFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        GeometricShape circle = GeometricShapeFactory.createGeometricShape("CIRCLE", 5.0);
        GeometricShape rectangle = GeometricShapeFactory.createGeometricShape("RECTANGLE", 3.0, 4.0);
        GeometricShape square = GeometricShapeFactory.createGeometricShape("SQUARE", 2.5);

        System.out.println("Area Circulo: " + circle.getArea());
        System.out.println("Area Cuadrado: " + square.getArea());
        System.out.println("Area Rectangulo: " + rectangle.getArea());
    }
}
