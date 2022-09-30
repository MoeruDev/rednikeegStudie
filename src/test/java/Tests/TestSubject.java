package Tests;

import mainpack.module.subject.AbstractSubject;
import mainpack.module.subject.Apartment;
import mainpack.module.subject.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSubject {
    @Test
    void testHouse(){
        AbstractSubject house = new House();
        Assertions.assertEquals("House",house.getType());
    }
    void testApartment(){
        AbstractSubject apartment = new Apartment();
        Assertions.assertEquals("Apartment",apartment.getType());
    }
}
