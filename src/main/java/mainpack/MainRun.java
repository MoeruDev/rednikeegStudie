package mainpack;

import mainpack.module.Agreement;
import mainpack.module.Client;
import mainpack.module.subject.AbstractSubject;
import mainpack.module.subject.Apartment;
import mainpack.module.subject.House;

import java.util.Scanner;

public class MainRun {

    public static void main(String[] args) {
        Database database = new Database();
        InOutHandler handler = new InOutHandler();
        Scanner scanner = new Scanner(System.in);
        int choice, index,index2;
        do{
            handler.mainMenu();
            choice = scanner.nextInt();
            if(choice == 1){
                Client tmp = new Client();
                handler.addClient(tmp);
                database.getList().add(tmp);
                System.out.println("Client successfully added");
            }
            else if(choice > 1 && choice < 7){
                if(database.getList().isEmpty())
                {
                    System.out.println("There are no clients in the database");
                } else {
                    if (choice == 2) {
                        Agreement tmp1 = new Agreement();
                        handler.addAgreement(tmp1);
                        System.out.println("Choose the client to create the agreement");
                        handler.printClients(database);
                        index = scanner.nextInt();
                        database.getList().get(index).getAgreementList().add(tmp1);
                        System.out.println("Agreement successfully added to " + database.getList().get(index).getName() + " " +
                                database.getList().get(index).getSurname());
                    }
                    else if (choice == 3) {
                        System.out.println("Choose the client");
                        handler.printClients(database);
                        index = scanner.nextInt();
                        if(database.getList().get(index).getAgreementList().isEmpty()){
                            System.out.println("There are no agreements for this client");
                        } else {
                            handler.printAgreements(database,index);
                            System.out.println("Choose the agreement");
                            index2 = scanner.nextInt();
                            handler.subjectMenu();
                            int choiceSub = scanner.nextInt();
                            AbstractSubject tmp;
                            if(choiceSub == 1){
                                tmp = new House();
                            } else {
                                tmp = new Apartment();
                            }
                            handler.addSubject(tmp);
                            database.getList().get(index).getAgreementList().get(index2).setSubject(tmp);
                        }
                    }

                    else if (choice == 4) {
                        do{
                            handler.incomeMenu();
                            choice = scanner.nextInt();
                            if(choice == 1){
                                System.out.println("Income for all the clients' agreements is = " + database.calcAll());
                            } else if (choice == 2) {
                                System.out.println("Choose the client to calculate all the agreements' income");
                                handler.printClients(database);
                                index = scanner.nextInt();
                                System.out.println("Client income is = " + database.getList().get(index).calcClientIncome());
                            } else if (choice == 3) {
                                System.out.println("The average income per client is = " + database.calcAverage());
                            } else {
                                System.out.println("Exiting...");
                            }
                        }while (choice < 4);
                    }
                    else if (choice == 5) {
                        handler.printClients(database);
                    } else {
                        System.out.println("Choose the client to see the agreements");
                        handler.printClients(database);
                        index = scanner.nextInt();
                        if(database.getList().get(index).getAgreementList().isEmpty()){
                            System.out.println("There are no agreements for this client");
                        } else {
                            handler.printAgreements(database,index);
                        }
                    }
                }
            }
            else {
                System.out.println("Exiting...");
            }
        }while (choice < 7);
    }
}
