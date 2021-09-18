package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private final Fraction fraction = new Fraction(2,5);

    @Test
    void testFractionGetDecimal(){
        assertEquals(0.4, fraction.decimal());
    }

}
