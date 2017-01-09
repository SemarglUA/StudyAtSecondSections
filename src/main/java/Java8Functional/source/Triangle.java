package main.java.Java8Functional.source;

import main.java.Java8Functional.source.Shape;

public class Triangle extends Shape {
    protected String name;

    Triangle(int x, int y, int z, String name){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    @Override
    public void showPoint(){
        System.out.println("Shape: x = " + x + "y = " + y + "z = " + z);
    }
}
