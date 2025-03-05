package org.pendesign.entity;

public class Nib {


    private double radius;

    public Nib(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Nib{" +
                "radius=" + radius +
                '}';
    }
}
