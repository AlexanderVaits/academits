package academits.vaits.main_shape;

import academits.vaits.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(2, 3),
                new Square(4),
                new Triangle(0, 2, 3, 0, 2, 3),
                new Circle(4),
                new Rectangle(2, 4),
                new Square(3),
                new Triangle(1, 3, 5, 1, 3, 5),
                new Circle(4),
        };

        Arrays.sort(shapes, new AreaComparator());
        System.out.println("Фигура с наибольшей площадью - " + shapes[shapes.length - 1]);

        Arrays.sort(shapes, new PerimeterComparator());
        System.out.println("Фигура со вторым наибольшим периметром - " + shapes[shapes.length - 2]);
    }
}
