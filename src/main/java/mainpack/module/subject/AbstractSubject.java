package mainpack.module.subject;

public abstract class AbstractSubject {
    protected String name;
    protected Double nominalPrice;

    public String getName() {
        return name;
    }

    public Double getNominalPrice() {
        return nominalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNominalPrice(Double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return
                "subject name = " + name +
                ", nominal price = " + nominalPrice;
    }
}
