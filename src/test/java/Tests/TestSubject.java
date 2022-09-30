package Tests;

import mainpack.module.subject.AbstractSubject;
import mainpack.module.subject.Apartment;
import mainpack.module.subject.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSubject {
    @Test
    void testHouse() {
        AbstractSubject house = new House();

        String result = house.getType();
        Assertions.assertEquals("House", result);
    }

    void testApartment() {
        AbstractSubject apartment = new Apartment();

        String result = apartment.getType();

        Assertions.assertEquals("Apartment", result);
    }
}
