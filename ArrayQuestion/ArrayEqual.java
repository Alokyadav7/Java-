package ArrayQuestion;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};

        boolean AK = Arrays.equals(a,b);

        if (AK==true) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("not same");
        }
    }
}
