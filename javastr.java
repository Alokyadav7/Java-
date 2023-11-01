import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class javastr {
    public static void main(String[] args) {
        //String name = "Siva, Rashmika, Ranveer, Deepika, Ranbir, Alia";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me everybody ,s name, seperated by comma:-");
        String name = scanner.nextLine();
        String[] nameArray = name.split(",  ");
        List<String> nameList = Arrays.asList(nameArray);
        System.out.println(nameList);

        Random random = new Random();
        String who = nameList.get(random.nextInt(nameList.size()));
        System.out.println(who + "is going to pay the  bill");
    }
}