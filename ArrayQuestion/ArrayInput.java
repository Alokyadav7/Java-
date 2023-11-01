package ArrayQuestion;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of an square matrix N x N:");
        int n = in.nextInt();

        int a [][] = new int [n][n];
        System.out.println("Enter the size of an array:");
        // taking the input from the array element
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++)
                a[i][j]= in.nextInt();
        }

        // printing the 2d array
        System.out.println("SQUARE MATRIX ARE:-");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println( );
        }
        // sum of diagonal is
        int sumL=0;
        int sumR=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j)
                    sumL+=a[i][j];
                if (i+j==n-1)
                    sumR+=a[i][j];
            }
        }
        System.out.println("Sum of Diagonal");
        System.out.println("Sum of Left Diagonal is:" +sumL);
        System.out.println("Sum of Right Diagonal is:" +sumR);

    }
}
