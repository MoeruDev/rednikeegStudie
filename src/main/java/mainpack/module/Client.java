package mainpack.module;

import java.util.ArrayList;
import java.util.List;

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
    public Client(){
        agreementList = new ArrayList<>();
    }


    public double calcClientIncome(){
       return agreementList.stream()
                .mapToDouble(Agreement::getIncome)
                .sum();
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Phone Number='" + phoneNum + '\'';
    }
}
