package mainpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private String name;
    private String surname;
    private String phoneNum;

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
        name = null;
        surname = null;
        phoneNum = null;
        agreementList = new ArrayList<>();
    }

    Client(String nm, String sn, String pn){
        name = nm;
        surname = sn;
        phoneNum = pn;
    }

    public void addClient(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        setName(scan.nextLine());

        System.out.println("Enter surname:");
        setSurname(scan.nextLine());

        System.out.println("Enter phone number:");
        setPhoneNum(scan.nextLine());
    }

    public void printAgreements(){

        for(int i=0; i <agreementList.size();i++){
            System.out.println(i+". "+ agreementList.get(i).getTitle() + " "
                    + agreementList.get(i).getNumber() + " " + agreementList.get(i).getIncome());
        }
    }

    public int calcClientIncome(){
        int result = 0;
        for(int i = 0; i <agreementList.size(); i++){
            result += agreementList.get(i).getIncome();
        }
        return result;
    }
}
