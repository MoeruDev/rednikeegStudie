package mainpack;

public class House extends AbstractSubject{
    House()
    {
        name = "House";
        nominalPrice = (double)250000;
    }
    @Override
    public String getType(){
        return "House";
    }

}
