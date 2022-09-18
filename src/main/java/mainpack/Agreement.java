package mainpack;

import java.util.Scanner;

public class Agreement {
    private String title;
    private Integer number;
    private Double income;

    private AbstractSubject subject;

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setIncome() {
        if(this.subject.getType().equals("House")){
            this.income = subject.nominalPrice * 0.02 + 250;
        } else {
            this.income = subject.nominalPrice * 0.01 + 100;
        }
    }

    public void setSubject(AbstractSubject subject) {
        this.subject = subject;
    }
    //getters

    public String getTitle(){
        return this.title;
    }

    public Integer getNumber(){
        return this.number;
    }

    public AbstractSubject getSubject() {
        return subject;
    }

    public Double getIncome(){
        return this.income;
    }

    //constructor

    Agreement(){
        income = 0.0;
    }

    Agreement(String nm, Integer num, Double in){
        title = nm;
        number = num;
        income = in;
    }


    @Override
    public String toString() {
        if(subject == null)
        {
            return
                    "Title='" + title + '\'' +
                            ", Number=" + number +
                            ", Income=" + income;
        } else {
            return
                    "Title='" + title + '\'' +
                            ", Number=" + number +
                            ", Income=" + income +
                            ", " + subject.toString();
        }

    }
}
