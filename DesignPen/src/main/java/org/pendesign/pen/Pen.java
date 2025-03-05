package org.pendesign.pen;

import org.pendesign.strategy.WritingStrategy;

public abstract class Pen {

 private int price;
 private String brand;
 private String name;
 public WritingStrategy writingStrategy;

    public Pen(int price, String brand, String name) {
        this.price = price;
        this.brand = brand;
        this.name = name;
    }

    public void setWritingStrategy(WritingStrategy writingStrategy)
    {
        this.writingStrategy = writingStrategy;
    }

    public void write()
    {
        if(writingStrategy==null)
        {
            throw new IllegalArgumentException("WritingStrategy not defined");
        }
        System.out.println(brand+ " "+ name + " pen is being used: ");
        writingStrategy.write();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getType();


    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", writingStrategy=" + writingStrategy +
                '}';
    }

}
