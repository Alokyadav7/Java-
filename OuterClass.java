public class OuterClass {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int sum = sumOfOuterElements(arr);
        System.out.println("Sum of outer elements: " + sum);
    }

    public static int sumOfOuterElements(int[][] arr) {
        int sum = 0;
        int rows = arr.length;
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Check if the element is on the outer edge
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}

