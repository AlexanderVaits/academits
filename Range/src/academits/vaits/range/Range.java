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

    public String toString() {
        return "(" + from +
                ", " + to + ")";
    }

    public Range getIntersection(Range newRange) {
        if (this.from > newRange.to || newRange.from > this.to) {
            return null;
        }

        double from = Math.max(this.from, newRange.from);
        double to = Math.min(this.to, newRange.to);

        if (from == to) {
            return null;
        }

        return new Range(from, to);
    }

    public Range[] gerMerge (Range newRange) {
        if (this.from > newRange.to || newRange.from > this.to) {
            Range [] ranges = new Range[2];
            ranges[0] = new Range(this.from, this.to);
            ranges [1] = newRange;

            return ranges;
        }

        double from = Math.min(this.from, newRange.from);
        double to = Math.max(this.to, newRange.to);
        Range [] ranges = new Range[1];
        ranges [0] = new Range(from, to);

        return ranges;
    }
}