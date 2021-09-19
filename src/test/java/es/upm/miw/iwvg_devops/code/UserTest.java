package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

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
    void testUserGetId(){
       assertEquals("1", user.getId());
    }

    @Test
    void testUserGetUserName(){
        assertEquals("Sara", user.getName());
    }

    @Test
    void testSetUserName(){
        user.setName("Paula");
        assertEquals("Paula" , user.getName() );
    }

    @Test
    void testGetUserFamilyName(){
        assertEquals("Mendez", user.getFamilyName());
    }

    @Test
    void testSetUserFamilyName(){
        user.setFamilyName("Winx");
        assertEquals("Winx", user.getFamilyName());
    }

    @Test
    void testSetUserFractions(){
        List<Fraction> list = List.of(
                new Fraction(2, 5)
        );

        List<Fraction> fractions = new ArrayList<>(list);

        user.setFractions(fractions);

        assertEquals(fractions, user.getFractions());


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

    @Test
    void testUserToString(){
        String expected = "User{" +
                "id='" + user.getId() + '\'' +
                ", name='" + user.getName() + '\'' +
                ", familyName='" + user.getFamilyName() + '\'' +
                ", fractions=" + user.getFractions() +
                '}';
        String actual = user.toString();
        assertEquals(expected,actual);
    }

}
