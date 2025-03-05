package org.pendesign;

import org.pendesign.decorator.CameraAddonPen;
import org.pendesign.decorator.StickerAddonPen;
import org.pendesign.entity.Ink;
import org.pendesign.entity.Nib;
import org.pendesign.entity.Refill;
import org.pendesign.pen.BallPen;
import org.pendesign.pen.FountainPen;
import org.pendesign.pen.GelPen;
import org.pendesign.pen.Pen;
import org.pendesign.strategy.FastWritingStrategy;
import org.pendesign.strategy.SlowWritingStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create basic components
        Ink blueInk = new Ink("Blue");
        Ink blackInk = new Ink("Black");
        Nib fineNib = new Nib(0.5);
        Nib mediumNib = new Nib(0.7);
        Nib broadNib = new Nib(1.0);

        // Create refills
        Refill blueRefill = new Refill(blueInk,fineNib);
        Refill blackRefill = new Refill(blackInk,mediumNib);

        // Create different types of pens
        Pen ballPen = new BallPen(10,"Reynolds","Jetter",blueRefill);
        Pen gelPen  = new GelPen(25,"Pilot","G2",blackRefill);
        Pen fountainPen = new FountainPen(100,"Parker","Vector",blueInk,broadNib);

        //Set writing strategies
        ballPen.setWritingStrategy(new FastWritingStrategy());
        gelPen.setWritingStrategy(new FastWritingStrategy());
        fountainPen.setWritingStrategy(new SlowWritingStrategy());

        //Use Pens
        System.out.println("=== Basic Pens ===");
        System.out.println(ballPen);
        ballPen.write();
        System.out.println();

        System.out.println("===========");
        System.out.println(gelPen);
        ballPen.write();
        System.out.println();

        System.out.println("===========");
        System.out.println(fountainPen);
        ballPen.write();
        System.out.println();

        // Decorate pens with addons
        System.out.println("=== Decorated Pens ===");
        Pen stickerPen = new StickerAddonPen(ballPen,"Star Wars");
        System.out.println(stickerPen);
        stickerPen.write();
        System.out.println();

        Pen cameraPen = new CameraAddonPen(ballPen,"720p");
        System.out.println(cameraPen);
        cameraPen.write();
        //Using sepcific functionality of CameraAddonPen
        ((CameraAddonPen)cameraPen).takePhoto();
        System.out.println();

        //Multiple decorations
        Pen superPen = new CameraAddonPen(new StickerAddonPen(fountainPen,"Flowers"),"1080p");
        System.out.println(superPen);
        superPen.write();
        ((CameraAddonPen)superPen).takePhoto();


    }
}