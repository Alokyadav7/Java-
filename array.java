import java.lang.reflect.Array;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {

        /* int c = 10;
        int python = 11;
        int eng = 9;

        int[] mark = new int [3];
         mark [0] = 10;
         mark [1] = 11;
         mark [2] = 9;
        System.out.println(mark[0]);
        System.out.println(mark[2]);
        System.out.println(mark[1]);*/
        int eng = 89;
        int java = 100;
        int python = 99;
        int c = 98;

        int [] mark = new int [4];
        mark [0] = 89;
        mark [1] = 100;
        mark [2] = 99;
        mark [3] = 98;
       // System.out.println(mark[3]);
        //System.out.println(mark[1]);
        //System.out.println(mark[3]);
        // length
        //System.out.println(mark.length);
        // sort
        System.out.println(mark[3]);
        Arrays.sort(mark);
        System.out.println(mark[3]);



    }
}
