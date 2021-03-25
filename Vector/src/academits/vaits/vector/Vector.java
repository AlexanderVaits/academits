package academits.vaits.vector;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0");
        }

        double[] components = new double[n];
        Arrays.fill(components, 0);
        this.components = components;
    }

    public Vector(double[] components) {
        this.components = Arrays.copyOf(components, components.length);
    }

    public Vector(int n, double[] components) {
        if (n <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0");
        }

        if (n < components.length) {
            throw new IllegalArgumentException("Vector dimension must be > components number");
        }

        this.components = Arrays.copyOf(components, n);
    }

    public Vector(Vector v) {
        this(v.getComponents());
    }

    public double[] getComponents() {
        return components;
    }

    public void setComponents(double[] components) {
        this.components = components;
    }

    public static int getSize(Vector vector) {
        return vector.getComponents().length;
    }

    public void reduceToOneSize(Vector vector) {
        if (components.length > vector.components.length) {
            vector.components = Arrays.copyOf(vector.components, components.length);
        }

        if (vector.components.length > components.length) {
            components = Arrays.copyOf(components, vector.components.length);
        }
    }

    public void add(Vector vector) {
        if (components.length != vector.components.length) {
            this.reduceToOneSize(vector);
        }

        for (int i = 0; i < components.length; i++) {
            components[i] += vector.components[i];
        }
    }

    public void deduct(Vector vector) {
        if (components.length != vector.components.length) {
            this.reduceToOneSize(vector);
        }

        for (int i = 0; i < components.length; i++) {
            components[i] -= vector.components[i];
        }
    }

    public void multiplyByScalar(int multiplier) {
        for (int i = 0; i < components.length; i++) {
            components[i] *= multiplier;
        }
    }

    public void expand() {
        final int multiplier = -1;

        for (int i = 0; i < components.length; i++) {
            components[i] *= multiplier;
        }
    }

    public double getLength () {
        double result = 0;

        for (double component : components) {
            result += Math.pow(component, 2);
        }

        return Math.sqrt(result);
    }

    public double getComponent(int index) {
        return components[index];
    }

    public void setComponent(int index, double value) {
        this.components[index] = value;
    }

    public static Vector add(Vector vector1, Vector vector2) {
        if (vector1.components.length != vector2.components.length) {
            vector1.reduceToOneSize(vector2);
        }

        double[] newVectorComponents = new double[vector1.components.length];

        for (int i = 0; i < vector1.components.length; i++) {
            newVectorComponents[i] = vector1.components[i] + vector2.components[i];
        }

        return new Vector(newVectorComponents);
    }

    public static Vector deduct(Vector vector1, Vector vector2) {
        if (vector1.components.length != vector2.components.length) {
            vector1.reduceToOneSize(vector2);
        }

        double[] newVectorComponents = new double[vector1.components.length];

        for (int i = 0; i < vector1.components.length; i++) {
            newVectorComponents[i] = vector1.components[i] - vector2.components[i];
        }

        return new Vector(newVectorComponents);
    }

    public static double getScalarProductResult(Vector vector1, Vector vector2) {
        if (vector1.components.length != vector2.components.length) {
            vector1.reduceToOneSize(vector2);
        }

        double result = 0;

        for (int i = 0; i < vector1.components.length; i++) {
            result += vector1.components[i] * vector2.components[i];
        }

        return result;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Компоненты вектора: {");

        for (int i = 0; i < components.length - 1; i++) {
            result.append(components[i]).append(", ");
        }

        return result + "" + components[components.length - 1] + "}";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Vector v = (Vector) o;

        return components == v.components;
    }

    public int hashCode() {
        final int prime = 31;

        int hash = 1;
        for (double component : components) {
            hash = prime * hash + Double.hashCode(component);
        }

        return hash;
    }
}