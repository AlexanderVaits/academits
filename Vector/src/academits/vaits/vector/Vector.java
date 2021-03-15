package academits.vaits.vector;

public class Vector {
    private int n;
    private double[] components;

    public Vector (int n) {
        this.n = n;
    }

    public Vector (double [] components) {
        this.components  = components;
    }

    public Vector (int n, double [] components) {
        this.n = n;
        this.components  = components;
    }

    public int getN() {
        return this.n;
    }

    public void setN (int n) {
        this.n = n;
    }

    public double[] getComponents() {
        return components;
    }

    public void setComponents(double[] components) {
        this.components = components;
    }
}
