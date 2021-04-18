package academits.vaits.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return (number - from >= 0) && (to - number >= 0);
    }

    public String toString (){
        return "(" + from +
                ", " + to + ")";
    }

    public static Range getIntersection(Range range1, Range range2) {
        if (range1.isInside(range2.from) && range1.isInside(range2.to)) {
            return new Range(range2.from, range2.to);
        }

        if (range2.isInside(range1.from) && range2.isInside(range1.to)) {
            return new Range(range1.from, range1.to);
        }

        if (range1.isInside(range2.from) && range2.isInside(range1.to) && range1.from != range2.to && range2.from != range1.to) {
            return new Range(range2.from, range1.to);
        }

        if ((range1.isInside(range2.to) && range2.isInside(range1.from)) && range1.from != range2.to && range2.from != range1.to) {
            return new Range(range1.from, range2.to);
        }

        return null;
    }

}