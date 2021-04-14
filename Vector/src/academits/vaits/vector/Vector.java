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

        this.components = Arrays.copyOf(components, dimension);
    }

    public Vector(Vector v) {
        components = Arrays.copyOf(v.components, v.components.length);
    }

    public int getSize() {
        return components.length;
    }

    private void increaseToOneSize(Vector vector) {
        if (components.length < vector.components.length) {
            components = Arrays.copyOf(components, vector.components.length);
        }
    }

    public void add(Vector vector) {
        increaseToOneSize(vector);

        for (int i = 0; i < Math.min(components.length, vector.components.length); i++) {
            components[i] += vector.components[i];
        }
    }

    public void subtract(Vector vector) {
        increaseToOneSize(vector);

        for (int i = 0; i < Math.min(components.length, vector.components.length); i++) {
            components[i] -= vector.components[i];
        }
    }

    public void multiplyByScalar(double multiplier) {
        for (int i = 0; i < components.length; i++) {
            components[i] *= multiplier;
        }
    }

    public void reverse() {
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

    public static Vector getSum(Vector vector1, Vector vector2) {
        int vectorMaxLength = Math.max(vector1.components.length, vector2.components.length);
        double[] newVectorComponents = new double[vectorMaxLength];

        for (int i = 0; i < vectorMaxLength; i++) {
            newVectorComponents[i] = (i < vector1.components.length ? vector1.components[i] : 0) + (i < vector2.components.length ? vector2.components[i] : 0);
        }

        return new Vector(newVectorComponents);
    }

    public static Vector getDifference(Vector vector1, Vector vector2) {
        int vectorMaxLength = Math.max(vector1.components.length, vector2.components.length);
        double[] newVectorComponents = new double[vectorMaxLength];

        for (int i = 0; i < vectorMaxLength; i++) {
            newVectorComponents[i] = (i < vector1.components.length ? vector1.components[i] : 0) - (i < vector2.components.length ? vector2.components[i] : 0);
        }

        return new Vector(newVectorComponents);
    }

    public static double getScalarProduct(Vector vector1, Vector vector2) {
        double product = 0;
        double vectorsMinLength = Math.min(vector1.components.length, vector2.components.length);

        for (int i = 0; i < vectorsMinLength; i++) {
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