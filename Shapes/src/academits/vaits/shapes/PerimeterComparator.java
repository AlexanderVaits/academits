package academits.vaits.shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shapes> {
    @Override
    public int compare(Shapes o1, Shapes o2) {
        return (int) (o1.getPerimeter() - o2.getPerimeter());
    }
}
