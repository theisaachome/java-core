package com.isaachome.demo.order;

public final class Complex {
    private final  double real;
    private final double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double realPart() {
        return real;
    }
    public double imaginaryPart() {
        return imag;
    }

    public Complex plus(Complex other) {
        return new Complex(this.real+other.real, this.imag+other.imag);
    }

}
