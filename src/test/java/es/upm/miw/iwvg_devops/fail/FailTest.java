package es.upm.miw.iwvg_devops.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailTest {
    @Test
    @Disabled
    public void failTest(){
        assertEquals(1,3);
    }
}
