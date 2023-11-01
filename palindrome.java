import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:-");
        String word = sc.next();

        if (IsPalindrome(word))
        {
            System.out.println( "\"  "+word + "\" is a palindrome");
        }
        else
        {
            System.out.println("\" "+word + "\" is not a palindrome");
        }

    }
    static boolean IsPalindrome(String word) {
        int forwardindex=0, backwardindex=word.length()-1;
        while (forwardindex<=backwardindex) {
            char startchar = word.charAt(forwardindex);
            char endchar = word.charAt(backwardindex);
            if (startchar != endchar)
            {
                return false;
            }
            forwardindex++;
            backwardindex--;
        }

        return true;

    }
}
