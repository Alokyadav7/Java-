import java.util.Random;
import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;
        do {
            System.out.println("Guess my Number(1-100)");
            usernumber = sc.nextInt();

            if (usernumber == mynumber) {
                System.out.println("WOW! CORRECT NUMBER");
                break;
            }
            else if (usernumber > mynumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE");
            }
            else {
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }
        } while (usernumber >= 0);
        System.out.println("MY NUMBER WAS:-");
        System.out.println(mynumber);
    }
}
