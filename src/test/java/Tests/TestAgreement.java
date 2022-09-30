package Tests;


import mainpack.module.Agreement;
import mainpack.module.subject.AbstractSubject;
import mainpack.module.subject.Apartment;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class TestAgreement {
    @Test
    void testCountSubject(){
        Agreement agreement = new Agreement();
        AbstractSubject subject = new Apartment();
        subject.setNominalPrice(100000.0);
        agreement.setSubject(subject);
        Assertions.assertEquals(1100.0,agreement.getIncome());
    }
}
