package mainpack;

import java.util.List;
import java.util.Scanner;

public class InOutHndler {

    public void addClient(Client client){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        client.setName(scan.nextLine());

        System.out.println("Enter surname:");
        client.setSurname(scan.nextLine());

        System.out.println("Enter phone number:");
        client.setPhoneNum(scan.nextLine());
    }

    public void addAgreement(Agreement agreement){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter title:");
        agreement.setTitle(scan.nextLine());

        System.out.println("Enter number:");
        agreement.setNumber(scan.nextInt());

        System.out.println("Enter income:");
        agreement.setIncome(scan.nextInt());
    }

    public void printClients(Database database){
        for(int i=0; i <database.getList().size();i++){
            System.out.println(i+". "+ database.getList().get(i).toString());
        }
    }

    public void printAgreements(Database database,int index){
        for(int i=0; i <database.getList().get(index).getAgreementList().size();i++){
            System.out.println(i+". "+ database.getList().get(index).getAgreementList().get(i).toString());
        }
        //for(int i=0; i <database.getList().get(index).getAgreementList().size();i++){
        //    System.out.println(i+". "+ database.getList().get(index).getAgreementList().get(i).getTitle() + " "
       //             + database.getList().get(index).getAgreementList().get(i).getNumber() + " " +
       //             database.getList().get(index).getAgreementList().get(i).getIncome());
       // }
    }
}
