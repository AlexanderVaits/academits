package academits.vaits.vector;

public class Vector {
    private int n;


    public Vector(int n) {
        this.n = n;
    }
/*
    public Vector(Vector vector) {
        this(vector.getN(), vector.getComponents());
    }

    public Vector (double[] components) {
        this.components = components;
    }

    public Vector (int n, double[] components) {
        this.n = n;
        this.components = components;
    }
    */

    public int getN() {
        return this.n;
    }

    public int setN(int n) {
        return this.n = n;
    }
 /*
    public double[] getComponents(){
        return this.components;
    }

    public double[] setComponents (double [] components) {
        return this.components = components;
    }

 */
}
