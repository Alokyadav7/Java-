import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class li {
    public static void main(String[] args) {
        ArrayList<String> usa = new ArrayList<>(Arrays.asList(
                "Alok","Het","Yash","Ajit","Aman"
        ));
        System.out.println("Name Before:-" + usa);
        List<String> newname = Arrays.asList(
                "Anand","Suryadeep","Jagdish","Rushiraj"
        );
        usa.addAll(newname);
        System.out.println("Name After:-" + usa);
    }
}
