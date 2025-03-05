package org.pendesign.pen;

import org.pendesign.entity.Ink;
import org.pendesign.entity.Nib;
import org.pendesign.entity.Refill;

public class FountainPen extends Pen{

    private Ink ink;
    private Nib nib;

    public FountainPen(int price, String brand, String name, Ink ink,Nib nib) {
        super(price, brand, name);
        this.ink = ink;
        this.nib = nib;
    }

    public String getType()
    {
        return "FoundtainPen";
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    @Override
    public String toString() {
        return "FountainPen{" +
                "ink=" + ink +
                ", nib=" + nib +
                '}';
    }
}
