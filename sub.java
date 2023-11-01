import java.util.Scanner;
class subb {
    int total;
}
public  class sub {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        subb num1 = new subb ();
        System.out.println("enter num1:");
        Scanner abc = new Scanner(System.in);
        num1.total=abc.nextInt();
        subb num2 = new subb();
        System.out.println("enter num2");
        num2.total=abc.nextInt();
        int tot = num1.total - num2.total;
        System.out.println("subtraction is:");
        System.out.println(tot);
    }
}
