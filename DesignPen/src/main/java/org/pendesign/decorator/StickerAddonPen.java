package org.pendesign.decorator;

import org.pendesign.pen.Pen;

public class StickerAddonPen extends PenAddon{

    private String stickerDesign;

    public StickerAddonPen(Pen pen,String stickerDesign)
    {
        super(pen);
        this.stickerDesign = stickerDesign;
        //increased price for sticker addon
        this.setPrice(pen.getPrice()+5);
    }

    public void write()
    {
        super.write();
        System.out.println("Additionaly, it has a " +stickerDesign+" sticker that looks cool!");
    }

    public String getStickerDesign()
    {
        return stickerDesign;
    }

    public void setStickerDesign(String stickerDesign)
    {
        this.stickerDesign = stickerDesign;
    }

    @Override
    public String toString() {
        return super.toString()+" decorated with "+ stickerDesign+ " sticker";
    }

}
