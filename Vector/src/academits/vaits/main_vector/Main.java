package academits.vaits.main_vector;

import academits.vaits.vector.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] components = {
                1, 2, 4
        };

        Vector vector = new Vector(components);
        System.out.println(vector.getN());
    }
}
