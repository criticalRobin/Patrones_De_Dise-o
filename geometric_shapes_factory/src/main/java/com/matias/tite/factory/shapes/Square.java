package com.matias.tite.factory.shapes;

public class Square implements GeometricShape {
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setAttributes(double... attributes) {
        if (attributes == null || attributes.length != 1) {
            throw new IllegalArgumentException("Square needs only one attribute");
        }

        this.side = attributes[0];
    }
}
