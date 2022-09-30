package Tests;

import mainpack.Database;
import mainpack.module.Agreement;
import mainpack.module.Client;
import mainpack.module.subject.Apartment;
import mainpack.module.subject.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestDatabase {
    @Test
    void testCalcAllAndAvg(){
        Client client = new Client();
        client.getAgreementList().addAll(Arrays.asList(
                new Agreement(new Apartment(100000.0)),
                new Agreement(new House(100000.0))));
        Client client2 = new Client();
        client2.getAgreementList().addAll(Arrays.asList(
                new Agreement(new Apartment(200000.0)),
                new Agreement(new House(200000.0))));
        Database database = new Database();
        database.getList().addAll(Arrays.asList(client,client2));

        Double resultAll =database.calcAll();
        Double resultAvg =database.calcAverage();

        Assertions.assertEquals(9700.0,resultAll);
        Assertions.assertEquals(4850.0,resultAvg);
    }
}
