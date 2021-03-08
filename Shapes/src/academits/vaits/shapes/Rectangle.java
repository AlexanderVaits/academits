package academits.vaits.shapes;

public class Rectangle implements Shape {
    private double objectWidth;
    private double objectHeight;

    public Rectangle(double width, double height) {
        this.objectWidth = width;
        this.objectHeight = height;
    }

    public double getObjectWidth() {
        return objectWidth;
    }

    public void setWidth(double width) {
        this.objectWidth = width;
    }

    public double getObjectHeight(){
        return objectHeight;
    }

    public void setHeight(double height) {
        this.objectHeight = height;
    }

    @Override
    public double getWidth() {
        return objectWidth;
    }

    @Override
    public double getHeight() {
        return objectHeight;
    }

    @Override
    public double getArea() {
        return objectWidth * objectHeight;
    }

    @Override
    public double getPerimeter() {
        return (objectWidth + objectHeight) * 2;
    }

    @Override
    public String toString() {
        return "Прямоугольник: ширина = " + objectWidth
                + " высота = " + objectHeight
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

        Rectangle r = (Rectangle) o;
        return objectWidth == r.objectWidth && objectHeight == r.objectHeight;
    }

    public int hashCode(){
        final int prime = 31;
        int hash = 1;
        hash = prime * hash + Double.hashCode(objectWidth);
        hash = prime * hash + Double.hashCode(objectHeight);
        return hash;
    }
}
