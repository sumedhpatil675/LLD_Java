package org.pendesign.entity;

public class Refill {

    private Ink ink;
    private Nib nib;

    public Refill(Ink ink, Nib nib) {
        this.ink = ink;
        this.nib = nib;
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
        return "Refill{" +
                "ink=" + ink +
                ", nib=" + nib +
                '}';
    }
}
