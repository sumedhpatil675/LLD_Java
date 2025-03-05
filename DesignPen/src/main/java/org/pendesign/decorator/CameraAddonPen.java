package org.pendesign.decorator;

import org.pendesign.pen.Pen;

public class CameraAddonPen extends PenAddon{

    private String resolution;

    public CameraAddonPen(Pen pen,String resolution)
    {
        super(pen);
        this.resolution = resolution;
        // increased price for camera addon
        this.setPrice(pen.getPrice()+100);
    }

    public void takePhoto()
    {
        System.out.println("Taking a photo with "+resolution+ " resolution");
    }

    @Override
    public void write()
    {
        super.write();
        System.out.println("This pen can also take photos with "+ resolution+ "resolution!");
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return super.toString()+"equiped with a "+ resolution+" camera";
    }

}
