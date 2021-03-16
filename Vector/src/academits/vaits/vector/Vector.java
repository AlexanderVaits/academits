package academits.vaits.vector;

import java.util.Arrays;

public class Vector {
    private int n;
    private double[] components;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0");
        }

        this.n = n;
        double[] components = new double[n];
        Arrays.fill(components, 0);
        this.components = components;
    }

    public Vector(double[] components) {
        this.components = components;
        this.n = components.length;
    }

    public Vector(int n, double[] components) {
        if (n <= 0) {
            throw new IllegalArgumentException("Vector dimension must be > 0");
        }

        if (n < components.length) {
            throw new IllegalArgumentException("Vector dimension must be > components number");
        }

        this.n = n;
        this.components = Arrays.copyOf(components, n);
    }

    public Vector(Vector v) {
        this(v.getN(), v.getComponents());
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double[] getComponents() {
        return components;
    }

    public void setComponents(double[] components) {
        this.components = components;
    }

    public int getSize(Vector vector) {
        return vector.getN();
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Компоненты вектора: {");

        for (int i = 0; i < components.length - 1; i++){
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
        return n == v.n && components == v.components;
    }

    public int hashCode() {
        final int prime = 31;

        int hash = 1;
        for (double component : components) {
            hash = prime * hash + Double.hashCode(component);
        }
        return prime * hash + n;
    }
}