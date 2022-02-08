package academits.vaits.matrix;

import java.util.Vector;

public class Matrix {
    private Vector[] components;

    public Matrix(int n, int m) {
        if (n < 0 || m <= 0) {
            throw new IllegalArgumentException("Error");
        }

        Vector [] vectors = new Vector[n];

        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(m);
        }

        components = vectors;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < components.length - 1; i++) {
            stringBuilder.append(components[i].toString()).append(", ");
        }

        stringBuilder.append(components[components.length - 1]).append("}");

        return stringBuilder.toString();
    }

}
