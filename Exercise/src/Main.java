public class Main {
    public static int getFirstAndLastDigitSum(int num) {
        int sum = 0;

        if (num < 10) {
            sum = num;
        } else {
            int lastDigit = num % 10;
            int firstDigit = num;
            while (10 <= firstDigit) {
                firstDigit /= 10;
            }
            sum = firstDigit + lastDigit;
        }
        return sum;
    }
    public  static boolean hasSameLastDigit(int[] num) {
        if (num == null || num.length == 0) {
            return false;
        }
        int[] lastDigit = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            lastDigit[i] = num[i]%10;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (lastDigit[i] == lastDigit[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static int getLargestPrime(int num) {
        if (num <= 1) {
            return -1;
        }
        int finalPrime = -1;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                finalPrime = i;
                num /= i;
            }
        }
        return finalPrime;
    }

    public static void main(String[] args) {
        int number1 = 9123;
        System.out.println(getFirstAndLastDigitSum(number1));
        System.out.println(getFirstAndLastDigitSum(5));

        int number2 =110;
        System.out.println(getLargestPrime(number2));
        int[] nums = {13,15,17,2325};
        System.out.println(hasSameLastDigit(nums));
    }

}