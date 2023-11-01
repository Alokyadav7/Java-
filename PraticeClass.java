public class PraticeClass {
    public static void main(String[] args) {
       /**** int [] a = new int [10];
        for (int i=0; i<10;i++) {
            a[i]=10-i;
        }
        for (int i=0;i<=10;i++) {
            System.out.println(a[i]);
        }
    }****/
       int [] [] a ={{1,2,3,4,5},{1,2,3,4,5}};
       int sum = 0;

       for (int i=0; i<a.length;i++) {
           for (int j=0; j<a[i].length;j++) {
               sum+=a[i][j];
           }
       }
        System.out.println(sum);
    }
}
