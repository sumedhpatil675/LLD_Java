package org.pendesign.strategy;

public class SlowWritingStrategy implements WritingStrategy{
    
    @Override
    public void write() {
        System.out.println("writing slowly with careful, deliberate strokes");
    }


}
