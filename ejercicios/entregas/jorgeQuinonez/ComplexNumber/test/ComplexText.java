package ComplexNumber.test;

import ComplexNumber.Main.Complex;

class ComplexText {
    public static void main(String[] args) {
        Complex a = new Complex(4.4, -67.0);
        Complex b = new Complex(5.4, -67.0);

        System.out.println("a = " + a + " , " + a.module());
        System.out.println("b = " + b + " , " + b.module());

        if (a.greaterThan(b) || b.lowerThan(a)) {
            System.out.println("a is greater than b  &  b is lowet than a");
        }
        if (a.lowerThan(b) || b.greaterThan(a)) {
            System.out.println("a is lower than b  &  b is greater than a");
        }
        if (a.equalTo(b)) {
            System.out.println("a & b are equal");
        }
    }
}
