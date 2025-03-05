package org.pendesign.entity;

public class Ink {
    private String color;


    public Ink(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ink{" +
                "color='" + color + '\'' +
                '}';
    }
}
