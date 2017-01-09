package main.filters.created.shape;

import main.java.Java8Functional.source.Shape;

@FunctionalInterface
public interface DefaultShapeFactory<T extends Shape> {
    T create();
}
