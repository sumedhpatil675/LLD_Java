package org.pendesign.pen;

import org.pendesign.entity.Refill;

public class GelPen extends Pen{

    private Refill refill;

    public GelPen(int price, String brand, String name, Refill refill) {
        super(price, brand, name);
        this.refill = refill;
    }
    public String getType()
    {
        return "GelPen";
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public String toString() {
        return super.toString()+ "with "+refill;
    }

}
