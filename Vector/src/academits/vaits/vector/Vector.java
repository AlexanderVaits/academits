package academits.vaits.vector;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public Vector(int dimension) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0. Now dimension is" + dimension);
        }
        components = new double[dimension];
    }

    public Vector(double[] components) {
        if (components.length == 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0. Now dimension is" + components.length);
        }

        this.components = Arrays.copyOf(components, components.length);
    }

    public Vector(int dimension, double[] components) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0. Now dimension is" + dimension);
        }

        if (components.length == 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0. Now dimension is" + components.length);
        }

        if (dimension < components.length) {
            dimension = components.length;
        }

        this.components = Arrays.copyOf(components, dimension);
    }

    public Vector(Vector v) {
        this.components = v.components;
    }

    public static int getSize(Vector vector) {
        return vector.components.length;
    }

    private void increaseToOneSize(Vector vector) {
        components = Arrays.copyOf(components, vector.components.length);
    }

    public void add(Vector vector) {
        if (components.length < vector.components.length) {
            increaseToOneSize(vector);
        }

        for (int i = 0; i < components.length; i++) {
            components[i] += (i < vector.components.length ? vector.components[i] : 0);
        }
    }

    public void subtract(Vector vector) {
        if (components.length < vector.components.length) {
            increaseToOneSize(vector);
        }

        for (int i = 0; i < components.length; i++) {
            components[i] -= (i < vector.components.length ? vector.components[i] : 0);
        }
    }

    public void multiplyByScalar(double multiplier) {
        for (int i = 0; i < components.length; i++) {
            components[i] *= multiplier;
        }
    }

    public void unfold() {
        multiplyByScalar(-1);
    }

    public double getLength() {
        double sum = 0;

        for (double component : components) {
            sum += component * component;
        }

        return Math.sqrt(sum);
    }

    public double getComponent(int index) {
        return components[index];
    }

    public void setComponent(int index, double value) {
        components[index] = value;
    }

    public static Vector getSumResult(Vector vector1, Vector vector2) {
        vector1.add(vector2);
        return new Vector(vector1);
    }

    public static Vector getSubtractionResult(Vector vector1, Vector vector2) {
        vector1.subtract(vector2);
        return new Vector(vector1);
    }

    public static double getScalarProduct(Vector vector1, Vector vector2) {
        double product = 0;

        for (int i = 0; i < Math.min(vector1.components.length, vector2.components.length); i++) {
            product += vector1.components[i] * vector2.components[i];
        }

        return product;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < components.length - 1; i++) {
            stringBuilder.append(components[i]).append(", ");
        }

        stringBuilder.append(components[components.length - 1]).append("}");

        return stringBuilder.toString();
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Vector v = (Vector) o;

        return Arrays.equals(components, v.components);
    }

    public int hashCode() {
        return Arrays.hashCode(components);
    }
}