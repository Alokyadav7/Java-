package StockMarket;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an empty array to hold the stock
        ArrayList<Stock> stocks = new ArrayList<>();

        // Display the menu and ask for input
        int choice;
        do {
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. View Stock");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // ask for stock detail
                    System.out.println("Enter the stock name:-");
                    String name = input.next();
                    System.out.println("Enter the stock quantity:-");
                    int quantity = input.nextInt();
                    System.out.println("Enter the stock price:-");
                    double price = input.nextDouble();

                    // create a new stock object and add it to the array list
                    Stock newStock = new Stock (name,quantity,price);
                    stocks.add(newStock);
                    System.out.println("Stock added successfully");
                    break;

                case 2:
                    // ask for the stock name and quantity to remove
                    System.out.println("Enter the stock name:-");
                    String stockName = input.next();
                    System.out.println("Enter the quatity to remove:-");
                    int removeQuantity = input.nextInt();

                    // loop through the stock
                    boolean stockFound = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equals(stockName)) {
                            // if the stock is found remove the specified quantity
                            stockFound = true;
                            stock.removeQuantity(removeQuantity);
                            System.out.println("Stock removed successfully");
                            break;
                        }
                    }
                    if (!stockFound) {
                        System.out.println("Stock not found");
                    }
                    break;

                case 3:
                    // display the list of stock
                    System.out.println("Current stocks:-");
                    for (Stock stock : stocks) {
                        System.out.println(stock.toString());
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.....");
                    break;

                default:
                    System.out.println("Invlaid choice, try again..");
            }
        } while (choice != 4);
        input.close();
    }
}

class Stock {
    private String name;
    private int quantity;
    private double price;

    public Stock (String name, int quantity, double price) {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void removeQuantity (int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
        }
        else {
            System.out.println("Not enough quantity to remove");
        }
    }

    public String toString() {
        return name + ", quantity: " + quantity + ", price: $" + price;
    }
}

