package mainpack;

import mainpack.module.Agreement;
import mainpack.module.Client;
import mainpack.module.subject.AbstractSubject;

import java.util.Scanner;

public class InOutHandler {

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
        InOutHandler inHandler = new InOutHandler();
        int choice;

        System.out.println("Enter title:");
        agreement.setTitle(scan.nextLine());

        System.out.println("Enter number:");
        agreement.setNumber(scan.nextInt());

    }

    public void addSubject(AbstractSubject subject){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        subject.setName(scan.nextLine());

        System.out.println("Enter Price:");
        subject.setNominalPrice(scan.nextDouble());

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
    }
    public void mainMenu(){
        System.out.println("\nMenu\n" + "Choose one option\n");
        System.out.println("1.Add Client");
        System.out.println("2.Create agreement for client");
        System.out.println("3.Create subject for agreement");
        System.out.println("4.Calculate the income of company");
        System.out.println("5.Show the info(clients)");
        System.out.println("6.Show the info(agreements)");
        System.out.println("7.Exit program");
    }
    public void incomeMenu(){
        System.out.println("\nChoose the criterion to calculate the income\n");
        System.out.println("4.1 All agreements");
        System.out.println("4.2 Specific client");
        System.out.println("4.3 Average agreements of clients");
        System.out.println("4.4 Exit");
    }
    public void subjectMenu(){
        System.out.println("Enter Subject:");
        System.out.println("1.House");
        System.out.println("2.Apartment");
    }
}
