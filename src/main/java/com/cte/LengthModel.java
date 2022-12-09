package com.cte;

public class LengthModel {
    public double d12;
    public double d13;
    public double d14;
    public double d23;
    public double d24;
    public double d34;
    public boolean xy_shape;
    public boolean xz_shape;

    @Override
    public String toString() {
        return "LengthModel{" +
                "d12=" + d12 +
                ", d13=" + d13 +
                ", d14=" + d14 +
                ", d23=" + d23 +
                ", d24=" + d24 +
                ", d34=" + d34 +
                ", xy_shape=" + xy_shape +
                ", xz_shape=" + xz_shape +
                ", yz_shape=" + yz_shape +
                '}';
    }

    public boolean yz_shape;

}
