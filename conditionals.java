import java.util.Scanner;
public class conditionals
 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("Enter speed:-");
        int speed = ab.nextInt();
        //int speed = 80;
    if (speed < 50)
    {
        System.out.println("slow and steady ride");
    }
    else if (speed >= 50 && speed < 100 ) {
        System.out.println("hold on tight");
    }
    else
    {
        System.out.println("Extereme speed");
    }
    }
}

