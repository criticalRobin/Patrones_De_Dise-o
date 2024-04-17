package com.matias.tite.factory.shapes;

public class Circle implements GeometricShape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setAttributes(double... attributes) {
        if (attributes == null || attributes.length != 1) {
            throw new IllegalArgumentException("Circle needs only one attribute");
        }

        this.radius = attributes[0];
    }
}
