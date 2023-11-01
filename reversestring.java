import java.util.Scanner;
import java.lang.String;


public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the line of text you want the reverse of:-");
        String text = sc.nextLine();

        String revText =  reverseString(text);
        System.out.println(text);
        System.out.println(revText);
    }
    static String reverseString(String text) {
        String[]  words = text.split("  ");
        String revString = " ";
        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            revString = revString+sb.reverse()+" ";
        }
        return revString;
    }
}
