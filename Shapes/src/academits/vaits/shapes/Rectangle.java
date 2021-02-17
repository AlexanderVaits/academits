package academits.vaits.shapes;

public class Rectangle implements Shapes {
    double sideLength1;
    double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    @Override
    public double getWeight() {
        return sideLength1;
    }

    @Override
    public double getHeight() {
        return sideLength2;
    }

    @Override
    public double getArea() {
        return sideLength1 * sideLength2;
    }

    @Override
    public double getPerimeter() {
        return (sideLength1 + sideLength2) * 2;
    }
}
