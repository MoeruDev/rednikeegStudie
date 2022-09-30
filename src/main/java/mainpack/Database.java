package mainpack;

import mainpack.module.Agreement;
import mainpack.module.Client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Database {
    private List<Client> list;

    public Database(){
        list = new ArrayList<>();
    }

    public List<Client> getList(){
        return this.list;
    }

    public int calcAll(){
        int result = 0;
        for(int i = 0;i< list.size(); i++){
            for(int k = 0; k<list.get(i).getAgreementList().size(); k++){
                result += list.get(i).getAgreementList().get(k).getIncome();
            }
        }
        return result;
    }

    public double calcAverage(){
        return (double) calcAll() / list.size();
    }
}
