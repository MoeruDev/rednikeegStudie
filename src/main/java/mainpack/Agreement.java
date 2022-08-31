package mainpack;

import java.util.Scanner;

public class Agreement {
    private String title;
    private Integer number;
    private Integer income;

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    //getters

    public String getTitle(){
        return this.title;
    }

    public Integer getNumber(){
        return this.number;
    }

    public Integer getIncome(){
        return this.income;
    }

    //constructor

    Agreement(){
        title = null;
        number = null;
        income = null;
    }

    Agreement(String nm, Integer num, Integer in){
        title = nm;
        number = num;
        income = in;
    }

    public void addAgreement(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter title:");
        setTitle(scan.nextLine());

        System.out.println("Enter number:");
        setNumber(scan.nextInt());

        System.out.println("Enter income:");
        setIncome(scan.nextInt());
    }
}
