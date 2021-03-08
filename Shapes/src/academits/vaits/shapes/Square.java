package academits.vaits.shapes;

public class Square implements Shape {

    private double sideLength;

    public Square (double sideLength){
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength (double sideLength) {
         this.sideLength = sideLength;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }

    @Override
    public double getHeight() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength * 2;
    }

    @Override
    public String toString() {
        return "Квадрат: длина стороны = " + sideLength
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

        Square s = (Square) o;
        return sideLength == s.sideLength;
    }

    public int hashCode(){
        final int prime = 31;
        int hash = 1;
        hash = prime * hash + Double.hashCode(sideLength);
        return hash;
    }
}