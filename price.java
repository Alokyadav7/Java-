public class price {
    public static void main(String[] args) {
        double price1 = 5.2;
        double price2 = 9.0;
        double price3 = 5.6;
        double price4 = 8.9;
        double price5 = 6.7;

        double high = price1;
        double low = price1;

        // higher price

        if (high < price2){
            high = price2;
        }

        if (high < price3){
            high = price3;
        }

        if (high < price4){
            high = price4;
        }

        if (high < price5){
            high = price5;
        }

        // lower price

        if (low > price2) {
            low = price2;
        }

        if (low > price3) {
            low = price2;
        }

        if (low > price4) {
            low = price2;
        }

        if (low > price5) {
            low = price2;
        }
        System.out.println(low);
        System.out.println(high);

    }
}
