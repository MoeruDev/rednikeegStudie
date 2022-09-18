package mainpack;

public class Apartment extends AbstractSubject{
    Apartment(){
        name = "Apartment";
        nominalPrice = (double)100000;
    }
    @Override
    public String getType(){
        return "Apartment";
    }
}
