package academits.vaits.matrix_main;

import academits.vaits.matrix.Matrix;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // test constructor
        Matrix matrix = new Matrix(3,4);
        System.out.println(matrix);
        // test vector???
        Vector vector = new Vector(4);
        System.out.println(vector);
    }
}
