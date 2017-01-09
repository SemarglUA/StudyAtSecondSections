package main.java.Java8Functional;

import main.filters.created.shape.DefaultShapeFactory;
import main.filters.created.shape.ShapeFactoryWhithTwoArgs;
import main.filters.created.shape.ShapeFactoryWhithThreeArgs;
import main.java.Java8Functional.interfaces.ShapesInterface;
import main.java.Java8Functional.source.Shape;
import main.java.Java8Functional.source.Triangle;

import java.util.*;

public class Java8NewFunctional {
    public static void main(String[] args) {

        ShapeFactoryWhithTwoArgs<Shape> factory_X_Y = Shape::new;
        Shape shape_1 = factory_X_Y.create(23, 34);
        Shape shape_2 = factory_X_Y.create(12, 25);
//        Triangle triangle_1 = (Triangle) factory_X_Y.create(123, 123);

        ShapeFactoryWhithThreeArgs<Shape> factory_X_Y_Z = Shape::new;
        Shape shape_3 = factory_X_Y_Z.creat(44, 44, 44);
        Shape shape_4 = factory_X_Y_Z.creat(55, 55, 55);
//        Triangle triangle_2 = (Triangle) factory_X_Y_Z.creat(222, 222, 222);

        DefaultShapeFactory factory = Shape::new;
        Shape shape_5 = factory.create();
        Shape shape_6 = factory.create();
//        Triangle triangle = (Triangle) factory.create();

        List<Shape> list = Arrays.asList(shape_1, shape_2, shape_3, shape_4, shape_5, shape_6/*, triangle, triangle_1, triangle_2*/);

        System.out.println("#CHECKING PARAMETERS#");

        for(ShapesInterface shape : list){
            shape.showPoint();
        }
    }
}
