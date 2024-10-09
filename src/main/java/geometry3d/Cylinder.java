package geometry3d;
import exceptions.NegativeHeightException;
import geometry2d.Figure;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws NegativeHeightException {
        if (height <= 0) {
            throw new NegativeHeightException("Высота должна быть положительной");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Цилиндр высотой " + height + " с основанием " + base;
    }
}

