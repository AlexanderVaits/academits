package academits.vaits.vector_main;

import academits.vaits.vector.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] components = {
                1, 2, 4, 5
        };

        Vector vector = new Vector(5, components);
        Vector vector1 = new Vector (vector);

        System.out.println(Arrays.toString(vector.getComponents()));
        System.out.println(vector1);
    }
}
