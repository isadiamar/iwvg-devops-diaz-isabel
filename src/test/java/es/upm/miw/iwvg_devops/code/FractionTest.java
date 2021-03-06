package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {
    List<Fraction> fractions;

    @BeforeEach
    void initFractions() {
        this.fractions = List.of(
                new Fraction(2, 5),
                new Fraction(7, -3),
                new Fraction(4, 10)
        );

    }

    @Test
    void testFractionByDefault() {
        assertEquals(new Fraction(1, 1), new Fraction());
    }

    @Test
    void testSettersOfFraction() {
        Fraction expected = new Fraction(1, 2);

        Fraction actual = fractions.get(0);
        actual.setNumerator(1);
        actual.setDenominator(2);

        assertEquals(expected, actual);
    }

    @Test
    void testFractionGetDecimal() {
        assertEquals(0.4, fractions.get(0).decimal());
    }

    @Test
    void testMultiplyFractions() {
        assertEquals(new Fraction(8, 50),
                fractions.get(0).multiply(fractions.get(2)));
    }

    @Test
    void testDivideFractions() {
        assertEquals(new Fraction(-6, 35),
                fractions.get(0).divide(fractions.get(1)));
    }

    @Test
    void testFractionsAreEquivalent() {
        assertTrue(fractions.get(0).isEquivalent(fractions.get(2)));
    }

    @Test
    void testAddFractions() {
        assertEquals(new Fraction(58, -30),
                fractions.get(1).add(fractions.get(2)));
    }

    @Test
    void testFractionIsProper() {
        assertTrue(fractions.get(0).isProper());
    }

    @Test
    void testFractionIsImproper() {
        assertTrue(fractions.get(1).isImproper());
    }

    @Test
    void testFractionToString() {
        String expected = "Fraction{" +
                "numerator=" + 4 +
                ", denominator=" + 10 +
                '}';

        String actual = fractions.get(2).toString();

        assertEquals(expected, actual);
    }
}
