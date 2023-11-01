package StockMarket;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        // Scanner class
        Scanner sc = new Scanner(System.in);
        // loop
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose Operation You Want To Perform");
            int choice = sc.nextInt();
            // Switch case
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdrawn : ");
                    withdraw= sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else {
                        System.out.println("Insufficient Balance");
                        System.out.println("");
                        break;
                    }

                        case 2:
                            System.out.println("Enter money to be deposited : ");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your money has been sucessfully deposited");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Balance:" +balance);
            }
        }
    }
}
