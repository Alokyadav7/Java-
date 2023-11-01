import java.util.Scanner;

public class Strs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = new String[10];

        // enter name
        for (int i=0; i<10;i++) {
            System.out.println("Enter Name:-" + (i+1) + ":");
            name[i]=sc.nextLine();
        }
        // check whether the name is present or not!
        System.out.println("Enter name to check:-");
        String NameToCheck = sc.nextLine();

        boolean Present = false;

        for (String names:name) {
            if (names.equalsIgnoreCase(NameToCheck)) {
                Present=true;
                break;
            }
        }
        if (Present) {
            System.out.println("The name you have enter is present!");
        }
        else {
            System.out.println("Sorry!, check again");
        }
    }
}