public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 20) {
            if (isPrime(number)) {
                if (number % 2 != 0) {
                    System.out.println(number);
                    count++;
                }
            }
            number++;
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}