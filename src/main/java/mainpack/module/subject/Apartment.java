package mainpack.module.subject;

import mainpack.module.subject.AbstractSubject;

public class Apartment extends AbstractSubject {
    public Apartment() {

    }

    public Apartment(Double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }

    @Override
    public String getType() {
        return "Apartment";
    }
}
