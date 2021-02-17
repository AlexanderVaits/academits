package academits.vaits.shapes;

public class Circle implements Shapes {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWeight() {
        return radius * 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
