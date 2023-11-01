package ArrayQuestion;

public class SumArray {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
