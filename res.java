import java.util.Scanner;

public class res {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a string that has to be reversed:-");
        Scanner s1 = new Scanner(System.in);
        s = s1.nextLine();
        int len = s.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
