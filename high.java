public class high {
    public static void main(String[] args) {
        int x=100;
        int y=20;
        int z=3;

        if (x>=y && x>=z){
            System.out.println("x is the highest");
        } else if (y>=x && y>=z) {
            System.out.println("y is the highest");
        }
        else {
            System.out.println("z is highest");
        }
    }
}
