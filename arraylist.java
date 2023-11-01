import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> usa = new ArrayList<>();
        usa.add("Arizona");
        usa.add("Alanska");
        usa.add("Hawaii");

        /*
         List<String> allstates = Array.aslist (
         "arizona","alanska","hawaii"
         );
         ***/

        System.out.println(usa);
        System.out.println("state joined first:-" + usa.get(0));
        System.out.println("Second State:-" + usa.get(1));
        System.out.println("last state:-" + usa.get(usa.size() -1));
    }
}




