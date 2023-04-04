package ComplexNumber.Main;

public class Complex implements Comparable {

    public Complex(double x, double y) {
        this.rational = x;
        this.irrational = y;
    }

    public Complex() {
        this.rational = 0.0;
        this.irrational = 0.0;
    }

    public double module() {
        return (Math.sqrt(Math.pow(rational, 2) + Math.pow(irrational, 2)));
    }

    public double real() {
        return this.rational;
    }

    public double imaginary() {
        return this.irrational;
    }

    public String toString() {
        return (rational + " + " + irrational + "i");
    }

    public boolean equals(Object x) {
        if (!(x instanceof Complex)) {
            return false;
        }
        Complex other = (Complex) x;
        return (this.rational == other.rational) && (this.irrational == other.irrational);
    }

    public boolean greaterThan(Comparable comp) {
        if (this.module() > ((Complex) comp).module())
            return true;
        else
            return false;
    }

    public boolean lowerThan(Comparable comp) {
        if (this.module() < ((Complex) comp).module()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalTo(Comparable comp) {
        if (this.module() == ((Complex) comp).module()) {
            return true;
        } else {
            return false;
        }
    }

    private double rational;
    private double irrational;
}
