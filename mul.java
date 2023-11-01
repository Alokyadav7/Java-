import java.util.Scanner;
class mull {
    int total;
}

public class mul {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:-");
        mull num1= new mull();
        System.out.println("Enter first number:-");
        Scanner alok = new Scanner(System.in);
        num1.total=alok.nextInt();
        mull num2= new mull();
        System.out.println("Enter Second Number:-");
        num2.total=alok.nextInt();
        int tot = (num1.total * num2.total);
        System.out.println("multiply is:");
        System.out.println(tot);





    }
}
