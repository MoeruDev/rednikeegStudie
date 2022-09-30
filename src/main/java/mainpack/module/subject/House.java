package mainpack.module.subject;

import mainpack.module.subject.AbstractSubject;

public class House extends AbstractSubject {
    public House() {

    }

    public House(Double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }

    @Override
    public String getType() {
        return "House";
    }

}
