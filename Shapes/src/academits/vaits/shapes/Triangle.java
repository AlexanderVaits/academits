package academits.vaits.shapes;

public class Triangle implements Shapes {
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double getSideLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }

    @Override
    public double getWeight() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    @Override
    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    @Override
    public double getPerimeter() {
        double sideLength1 = getSideLength(x1, x2, y1, y2);
        double sideLength2 = getSideLength(x1, x3, y1, y3);
        double sideLength3 = getSideLength(x3, x2, y3, y2);
        return sideLength1 + sideLength2 + sideLength3;
    }

    @Override
    public double getArea() {
        double sideLength1 = getSideLength(x1, x2, y1, y2);
        double sideLength2 = getSideLength(x1, x3, y1, y3);
        double sideLength3 = getSideLength(x3, x2, y3, y2);
        double semiPerimeter = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.sqrt((semiPerimeter * (semiPerimeter - sideLength1) * (semiPerimeter - sideLength2) * (semiPerimeter - sideLength3)));
    }

    @Override
    public String toString() {
        return "Треугольник: ширина = " + getWeight()
                + " высота = " + getHeight()
                + " площадь = " + getArea()
                + " периметр = " + getPerimeter();
    }
}
