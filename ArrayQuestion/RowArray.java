package ArrayQuestion;

public class RowArray {
    public static void main(String[] args) {
        int [] [] a = {{1,2,3,4}, {5,6,7,8}, {9,5,4,3}, {2,4,56,76}};

        // array matrix
        System.out.println("2D Array");
         for (int i=0; i<4; i++) {
           for   (int j=0; j<4; j++) {
                System.out.print(a[i][j] + "  ");
            }
             System.out.println();
        }

         // sum of row element
        System.out.println("Sum of Row are:-");
        for (int i=0; i<4; i++) {
            int sum=0;
            for (int j=0; j<4; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(" Sum of " +(i+1+"st")+  " row is " +sum);

        }
        // 2d array
        System.out.println("2D Array");
        for (int i=0; i<4; i++) {
            for   (int j=0; j<4; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        // sum of column element
        System.out.println("Sum of Column are:-");
        for (int i=0; i<4; i++) {
            int sum=0;
            for (int row=0; row<4; row++) {
                sum = sum + a[row][i];
            }
            System.out.println(" Sum of " +(i+1+"st")+  " column is " +sum);
        }

        // 2d array
        System.out.println("2D Array");
        for (int i=0; i<4; i++) {
            for   (int j=0; j<4; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        // sum of array diagonal
        int sumL=0;
        int sumR=0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (i==j)
                    sumL+=a[i][j];
                if (i+j==4-1)
                    sumR+=a[i][j];
            }
        }
        System.out.println("Sum Of Diagonal");
        System.out.println("Sum of Left Diagonal is:" +sumL);
        System.out.println("Sum of Right Diagonal is:" +sumR);
    }
}
