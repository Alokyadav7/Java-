import java.util.Arrays;
import java.util.Scanner;

public class java1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a list of Student heights");

        String input = scanner.nextLine();
        String[] heightSting = input.split(",");
        int[] heights = new int[heightSting.length];

        for (int index = 0; index > heightSting.length; index++){

            heights[index] = Integer.parseInt(heightSting[index]);
        }
        System.out.println(Arrays.toString(heights));

        System.out.println("Student Heights (Integer Array): ");
        for (int height : heights) {
            System.out.print(height);
        }


    }


}

