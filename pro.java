import java.util.Arrays;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a list os students height:-");
        String input = sc.nextLine();

        String[] heightstrings = input.split(" , ");

        int [] heights = new int[heightstrings.length];

        for (int index=0; index < heightstrings.length; index++) {
            heights[index] = Integer.parseInt(heightstrings[index]);
        }
        System.out.println(Arrays.toString(heights));
    }
}


