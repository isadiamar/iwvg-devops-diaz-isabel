package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private final Searches searches = new Searches();

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(1.0, 1.0, Double.NaN, Double.POSITIVE_INFINITY,1.0),
                searches.findDecimalFractionByUserName("Paula")
                        .collect(Collectors.toList()));
    }

}
