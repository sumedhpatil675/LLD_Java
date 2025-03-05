package org.pendesign.decorator;

import org.pendesign.pen.Pen;
import org.pendesign.strategy.WritingStrategy;

public abstract class PenAddon extends Pen {

    protected Pen pen;

    public PenAddon(Pen pen)
    {
        super(pen.getPrice(),pen.getBrand(),pen.getName());
        this.pen = pen;
        if(pen.writingStrategy !=null)
        {
            this.writingStrategy = pen.writingStrategy;
        }
    }

    public void write()
    {
        pen.write();
    }

    public void setWritingStrategy(WritingStrategy writingStrategy)
    {
        super.setWritingStrategy(writingStrategy);
        pen.setWritingStrategy(writingStrategy);
    }

    public String getType()
    {
        return pen.getType();
    }

}
