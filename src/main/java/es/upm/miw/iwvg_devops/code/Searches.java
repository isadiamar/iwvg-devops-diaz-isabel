package es.upm.miw.iwvg_devops.code;

import java.util.Comparator;
import java.util.stream.Stream;

public class Searches {

    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UserDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal);
    }

    public Fraction findFirstProperFractionByUserId(String id) {
        return new UserDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Fraction::isProper))
                .findFirst()
                .orElse(new Fraction(0, 0));
    }

    public Fraction findFractionAdditionByUserId(String id) {
        return new UserDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::add)
                .orElse(new Fraction(0, 0));
    }

    public Fraction findHighestFraction() {
        return new UserDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .filter(fraction -> !Double.isInfinite(fraction.decimal()) && !Double.isNaN(fraction.decimal()))
                .max(Comparator.comparing(Fraction::decimal))
                .orElse(new Fraction(0, 0));

    }
}
