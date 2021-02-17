package academits.vaits.shapes;

public class Square implements Shapes {

    double sideLength;

    public Square (double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getWeight() {
        return sideLength;
    }

    @Override
    public double getHeight() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength,2);
    }

    @Override
    public double getPerimeter() {
        return sideLength * 2;
    }
}