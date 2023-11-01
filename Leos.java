import java.lang.reflect.Array;
import java.util.Arrays;

public class Leos {
    public static void main(String[] args) {
        String [] arr1  = {"Alok","Yadav","Leo","Messi"};
        String [] arr2 = {"Alok","Yadav","Leo","Messi"};

        boolean isEqual= Arrays.equals(arr1,arr2);

        if (isEqual) {
            System.out.println("Both String are equal");
        }
        else {
            System.out.println("Not Equal! Thank u!!!!");
        }
    }
}
