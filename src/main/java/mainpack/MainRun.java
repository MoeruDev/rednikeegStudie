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
        Scanner scanner = new Scanner(System.in);
        int choice, index;
        do{
            menu.mainMenu();
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    Client tmp = new Client();
                    tmp.addClient();
                    database.getList().add(tmp);
                    System.out.println("Client successfully added");
                    break;
                case 2:
                    if(database.getList().isEmpty()){
                        System.out.println("There are no clients in the database");
                    } else {
                        Agreement tmp1 = new Agreement();
                        tmp1.addAgreement();
                        System.out.println("Choose the client to create the agreement");
                        database.printClients();
                        index = scanner.nextInt();
                        database.getList().get(index).getAgreementList().add(tmp1);
                        System.out.println("Agreement successfully added to " + database.getList().get(index).getName() + " " +
                                database.getList().get(index).getSurname());
                    }
                    break;
                case 3:
                    if(database.getList().isEmpty()){
                        System.out.println("There are no clients in the database");
                    } else {
                        menu.incomeMenu();
                        choice = scanner.nextInt();
                        while (choice < 4) {
                            switch (choice) {
                                case 1:
                                    System.out.println("Income for all the clients' agreements is = " + database.calcAll());
                                    break;
                                case 2:
                                    System.out.println("Choose the client to calculate all the agreements' income");
                                    database.printClients();
                                    index = scanner.nextInt();
                                    System.out.println("Client income is = " + database.getList().get(index).calcClientIncome());
                                    break;
                                case 3:
                                    System.out.println("The average income per client is = " + database.calcAverage());
                                    break;
                            }
                            menu.incomeMenu();
                            choice = scanner.nextInt();
                        }
                    }
                    break;
                case 4:
                    if(database.getList().isEmpty()){
                        System.out.println("There are no clients in the database");
                    } else {
                        database.printClients();
                    }
                    break;
                case 5:
                    if(database.getList().isEmpty()){
                        System.out.println("There are no clients in the database");
                    } else {
                        System.out.println("Choose the client to see the agreements");
                        database.printClients();
                        index = scanner.nextInt();
                        if(database.getList().get(index).getAgreementList().isEmpty()){
                            System.out.println("There are no agreements for this client");
                        } else {
                            database.getList().get(index).printAgreements();
                        }
                    }
                    break;
            }
        }while (choice < 6);
    }
}
