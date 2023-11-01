import java.util.Arrays;
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a list of Student heights");

        String input = scanner.nextLine();
        String[] heightSting = input.split(",");

        int[] heights = new int[heightSting.length];

        for (int index = 0; index < heightSting.length; index++) {

            heights[index] = Integer.parseInt(heightSting[index]);
        }

        for (int height : heights) {
            System.out.println(height);
        }
    }
}
