package mainpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private List<Client> list;

    Database(){
        list = new ArrayList<>();
    }
    public void printClients(){

       for(int i=0; i <list.size();i++){
           System.out.println(i+". "+ list.get(i).getName() + " "
                   + list.get(i).getSurname() + " " + list.get(i).getPhoneNum());
       }

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
        double result = (double) calcAll() / list.size();
        return result;
    }
}
