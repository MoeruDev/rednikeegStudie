package mainpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRun {
    public void mainMenu(){
        System.out.println("\nMenu\n" + "Choose one option\n");
        System.out.println("1.Add Client");
        System.out.println("2.Create agreement for client");
        System.out.println("3.Calculate the income of company");
        System.out.println("4.Show the info(clients)");
        System.out.println("5.Show the info(agreements)");
        System.out.println("6.Exit program");
    }
    public void incomeMenu(){
        System.out.println("\nChoose the criterion to calculate the income\n");
        System.out.println("3.1 All agreements");
        System.out.println("3.2 Specific client");
        System.out.println("3.3 Average agreements of clients");
        System.out.println("3.4 Exit");
    }
    public static void main(String[] args) {
        MainRun menu = new MainRun();
        Database database = new Database();
        InOutHndler handler = new InOutHndler();
        Scanner scanner = new Scanner(System.in);
        int choice, index;
        do{
            menu.mainMenu();
            choice = scanner.nextInt();
            if(choice == 1){
                Client tmp = new Client();
                handler.addClient(tmp);
                database.getList().add(tmp);
                System.out.println("Client successfully added");
            }
            else if(choice == 2 || choice == 3 || choice == 4 || choice == 5){
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
                        do{
                            menu.incomeMenu();
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
                    else if (choice == 4) {
                        handler.printClients(database);
                    }
                    else if (choice == 5) {
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
        }while (choice < 6);
    }
}
