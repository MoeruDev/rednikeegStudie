package Tests;

import mainpack.module.Agreement;
import mainpack.module.Client;
import mainpack.module.subject.Apartment;
import mainpack.module.subject.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestClient {
    @Test
    void testCalculateClientIncome() {
        Client client = new Client();
        client.getAgreementList().addAll(Arrays.asList(
                new Agreement(new Apartment(100000.0)),
                new Agreement(new House(100000.0))));

        Double result = client.calcClientIncome();

        Assertions.assertEquals(3350.0, result);

    }
}
