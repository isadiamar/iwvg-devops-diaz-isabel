package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private final Searches searches = new Searches();

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(1.0, 1.0, Double.NaN, Double.POSITIVE_INFINITY, 1.0),
                searches.findDecimalFractionByUserName("Paula")
                        .collect(Collectors.toList()));
    }

    @Test
    void testFindFirstProperFractionByUserId() {
        assertEquals(new Fraction(-1, 5),
                searches.findFirstProperFractionByUserId("2"));
    }

    @Test
    void testFindFractionAdditionByUserId() {
        assertEquals(new Fraction(16, 8),
                searches.findFractionAdditionByUserId("4"));
    }

    @Test
    void testFindHighestFraction() {
        assertEquals(new Fraction(2, 1),
                searches.findHighestFraction());
    }

}
