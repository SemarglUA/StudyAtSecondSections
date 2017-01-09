package main.filters.created.shape;

import main.java.Java8Functional.source.Shape;

@FunctionalInterface
public interface ShapeFactoryWhithTwoArgs<T extends Shape> {
    T create(int x, int y);
}
