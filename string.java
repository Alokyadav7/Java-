import java.sql.SQLOutput;
import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String  name ="Alok";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        String str = "This is alok yadav";
        System.out.println(str.toLowerCase());
        String a = "             ALOK          YADAV         ";
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1,2));
    }
}
