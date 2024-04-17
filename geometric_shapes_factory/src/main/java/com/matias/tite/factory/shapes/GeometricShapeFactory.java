package com.matias.tite.factory.shapes;

public class GeometricShapeFactory {
    public static GeometricShape createGeometricShape(String type, double... attributes) {
        GeometricShape shape = null;
        if ("CIRCLE".equalsIgnoreCase(type)) {
            shape = new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            shape = new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(type)) {
            shape = new Square();
        }

        if (shape != null) {
            shape.setAttributes(attributes);
        }

        return shape;
    }
}
