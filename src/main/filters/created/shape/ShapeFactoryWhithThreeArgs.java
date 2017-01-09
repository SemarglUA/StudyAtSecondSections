package main.filters.created.shape;

import main.java.Java8Functional.source.Shape;

@FunctionalInterface
public interface ShapeFactoryWhithThreeArgs<T extends Shape> {
    T creat(int x, int y, int z);
}
