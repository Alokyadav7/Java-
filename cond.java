import java.util.Scanner;

public class cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pen = 10
        // notebook = 40;
        System.out.println("Please tell us the amount of cash you have:-");
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("cannot buy anything");
            System.out.println("bring more cash");
        }
        else if (cash > 10 && cash < 50) {
            System.out.println("can get one thing");
        }
        else {
            System.out.println("can get both");
        }
    }
}
