package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void initUser() {
        List<Fraction> list = List.of(
                new Fraction(1, 5),
                new Fraction(0, 4)
        );

        List<Fraction> fractions = new ArrayList<>(list);

        this.user =
                new User("1", "Sara", "Mendez", fractions);

    }

    @Test
    void testGetUserFullName() {
        assertEquals("Sara Mendez", user.fullName());
    }

    @Test
    void testGetUserNameInitials() {
        assertEquals("S.", user.initials());
    }

    @Test
    void testAddFractionToUser() {
        Fraction newFraction = new Fraction(1, 3);
        user.addFraction(newFraction);
        assertEquals(List.of(
                        new Fraction(1, 5),
                        new Fraction(0, 4),
                        newFraction),
                user.getFractions());
    }

}
