package geometry2d;

import exceptions.NegativeRadiusException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws NegativeRadiusException {
        if (radius <= 0) {
            throw new NegativeRadiusException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг радиусом " + radius;
    }
}
