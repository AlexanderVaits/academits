package academits.vaits.main;

import academits.vaits.shapes.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shapes[] shape = new Shapes[9];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(2,3);
        shape[2] = new Square(4);
        shape[3] = new Triangle(1,2,3,1,2,3);
        shape[4] = new Circle(4);
        shape[5] = new Rectangle(2,4);
        shape[6] = new Square(3);
        shape[7] = new Triangle(1,3,5,1,3,5);
        shape[8] = new Circle(4);

        AreaComparator areaComparator = new AreaComparator();
        Arrays.sort(shape,areaComparator);
        System.out.println("Фигура с наибольшей площадью - " + shape[shape.length - 1].toString());


        PerimeterComparator perimeterComparator = new PerimeterComparator();
        Arrays.sort(shape,perimeterComparator);
        System.out.println("Фигура со вторым наибольшим периметром - " + shape[shape.length - 2].toString());
    }
}
