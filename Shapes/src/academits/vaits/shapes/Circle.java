package academits.vaits.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
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

    @Override
    public String toString() {
        return "Окружность: радиус = " + radius
                + " площадь = " + getArea()
                + " периметр = " + getPerimeter();

    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Circle c = (Circle) o;
        return radius == c.radius;
    }

    public int hashCode(){
        final int prime = 31;
        int hash = 1;
        hash = prime * hash + Double.hashCode(radius);
        return hash;
    }
}
