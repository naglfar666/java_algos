package org.example.algos.dtos;

public class VectorNew {

    private double x;

    private double y;

    private double z;

    public VectorNew(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public VectorNew() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double scalarProduct(VectorNew vectorNew) {
        return
                this.x * vectorNew.getX() +
                this.y * vectorNew.getY() +
                this.z * vectorNew.getZ();
    }

    public VectorNew crossProduct(VectorNew vectorNew) {
        return new VectorNew(
                this.y * vectorNew.getZ() - this.z * vectorNew.getY(),
                this.z * vectorNew.getX() - this.x * vectorNew.getZ(),
                this.x * vectorNew.getY() - this.y * vectorNew.getX()
                );
    }
}
