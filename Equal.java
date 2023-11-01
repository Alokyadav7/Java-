import java.util.Arrays;

public class Equal {
    public static void main(String[] args) {
        int [] a = {10,11,12,14,15};
        int [] b = {10,11,12,14,15};

        boolean Fun = Arrays.equals(a,b);

        if (Fun==true) {
            System.out.println("Both Array Are Equal");
        }
        else {
            System.out.println("Both Array Are Not Equal");
        }
    }
}
