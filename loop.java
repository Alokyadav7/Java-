import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter any number:-");
            number = sc.nextInt();
            System.out.println("Here is your number:-");
            System.out.println(number);
        }
        while (number <= 90);
        System.out.println("THE END");
    }
}
