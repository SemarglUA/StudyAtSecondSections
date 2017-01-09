package main.java.Java8Functional.source;

import main.java.Java8Functional.interfaces.ShapesInterface;

public class Shape implements ShapesInterface {

    protected int x, y, z;

    public Shape(){
        x = 2;
        y = 2;
        z = 2;
    }

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        z = 2;
    }

    public Shape(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void showPoint(){
        System.out.println("Shape: x = " + x + " y = " + y + " z = " + z);
    }
}
