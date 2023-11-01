import java.util.Scanner;
class division {
    int total;
}
public class div {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        division num1 = new division();
        System.out.println("Enter first number:-");
        Scanner abc = new Scanner(System.in);
        num1.total=abc.nextInt();
        division num2 = new division();
        System.out.println("Enter second number:-");
        num2.total=abc.nextInt();
        int tot= num1.total / num2.total;
        System.out.println("Division of two number is:-");
        System.out.println(tot);




    }
}
