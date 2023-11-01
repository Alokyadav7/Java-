public class student {
    String name = "alok";
    int roll_no = 10;
    int marks1=85, marks2=87, marks3=98;

    int getMarks()
    {

        return marks1+marks2+marks3;
    }
    void getGrades () {
        System.out.println("Students with rool_no  "+roll_no+" is sercued a good grade");
    }

    public static void main(String[] args) {
        student alok = new student();
        System.out.println(alok.getMarks());
        alok.getMarks();
        System.out.println(alok.marks3);
        System.out.println(alok.marks1);
        System.out.println(alok.name);
        System.out.println(alok.marks3);
    }
}
