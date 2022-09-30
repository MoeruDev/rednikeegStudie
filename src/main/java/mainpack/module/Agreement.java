package mainpack.module;

import mainpack.module.subject.AbstractSubject;

public class Agreement {
    private String title;
    private Integer number;

    private AbstractSubject subject;

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        if(this.subject.getType().equals("House")){
            return subject.getNominalPrice() * 0.02 + 250;
        } else if(this.subject.getType().equals("Apartment")){
            return subject.getNominalPrice() * 0.01 + 100;
        } else {
            throw new RuntimeException();
        }
    }

    //constructor

    public Agreement(){

    }

    public Agreement(AbstractSubject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        if(subject == null)
        {
            return
                    "Title='" + title + '\'' +
                            ", Number=" + number +
                            ", Income=" + getIncome() ;
        } else {
            return
                    "Title='" + title + '\'' +
                            ", Number=" + number +
                            ", Income=" +
                            ", " + subject.toString();
        }

    }
}
