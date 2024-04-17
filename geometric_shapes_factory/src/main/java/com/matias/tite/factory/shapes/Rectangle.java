package com.matias.tite.factory.shapes;

public class Rectangle implements GeometricShape {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void setAttributes(double... attributes) {
        if (attributes == null || attributes.length != 2) {
            throw new IllegalArgumentException("Rectangle needs two attributes");
        }

        this.width = attributes[0];
        this.height = attributes[1];
    }
}
