package es.upm.miw.iwvg_devops.code;

import java.util.Objects;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.getNumerator() < this.getDenominator();
    }

    public boolean isImproper() {
        return !isProper();
    }

    public Fraction multiply(Fraction fraction) {
        int num = this.numerator * fraction.getNumerator();
        int den = this.denominator * fraction.getDenominator();

        return new Fraction(num, den);
    }

    public Fraction divide(Fraction fraction) {
        int num = this.numerator * fraction.getDenominator();
        int den = this.denominator * fraction.getNumerator();

        return new Fraction(num, den);
    }

    public boolean isEquivalent(Fraction fraction) {
        Fraction aux = divide(fraction);
        return aux.getNumerator() == aux.getDenominator();
    }

    public Fraction add(Fraction fraction) {
        Fraction aux = divide(fraction);

        int num = aux.getNumerator() + aux.getDenominator();
        int den = this.denominator * fraction.getDenominator();

        return new Fraction(num, den);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
