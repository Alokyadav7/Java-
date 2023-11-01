import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a list of students height:-");
        String input = sc.nextLine();
        String [] heightstrings = input.split(" ");
        int [] heights = new int[heightstrings.length];

        for (int n=0; n<heightstrings.length; n++)
        {
            heights[n] = Integer.parseInt(heightstrings[n]);
        }
        int sum = 0;
        for (int height : heights) {
            sum += height;
            sum = sum + height;
        }
        //int numberOfStudents = studentHeight.length;


    }
}
