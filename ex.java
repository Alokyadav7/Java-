import java.util.Scanner;
class Subject {
    int max = 100;
    int total;
}
public class ex {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        System.out.println("Enter Python Mark:");
        Scanner abc = new Scanner(System.in);
        s1.total = abc.nextInt();
        Subject s2 = new Subject();
        System.out.println("Enter Java Mark");
        s2.total = abc.nextInt();
        Subject s3= new Subject();
        System.out.println("Enter Javascript mark:");
        s3.total = abc.nextInt();
        Subject s4= new Subject();
        System.out.println("Enter C++ mark:");
        s4.total = abc.nextInt();
        Subject s5= new Subject();
        System.out.println("Enter ASP.NET mark:");
        s5.total = abc.nextInt();
        int tot = (s1.total)+(s2.total)+(s3.total)+(s4.total)+(s5.total);
        int per = (tot * 100/500);
        System.out.println("percentage obtained:\n"+ per);
        System.out.println("Total Mark Obtained:");
        System.out.println(tot);
    }
}