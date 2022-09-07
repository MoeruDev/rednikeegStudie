package mainpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private String name, surname, phoneNum;
    private List<Agreement> agreementList;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    // getters
    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }

    public List<Agreement> getAgreementList(){ return this.agreementList;}
    //constructor
    Client(){
        agreementList = new ArrayList<>();
    }

    Client(String nm, String sn, String pn){
        name = nm;
        surname = sn;
        phoneNum = pn;
    }



    public int calcClientIncome(){
        int result = 0;
        for(int i = 0; i <agreementList.size(); i++){
            result += agreementList.get(i).getIncome();
        }
        return result;
         // int result1 =agreementList.stream()
         //       .map(Agreement::getIncome)
         //       .sum();
    }
}
