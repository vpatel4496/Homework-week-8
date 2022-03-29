package Homeworkweek8;

public class V7FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumDigits(4);
    }
    public static int sumDigits(int number) {
        int num = 0;
        int sum = 0;
        sum = FirstLastDigitSum(number);
        System.out.println("The sum of first & last"
                + " digit of the number " + number
                + " = " + sum);
        return sum;
    }
    private static int FirstLastDigitSum(int number) {
        int lastDigit, firstDigit, divisor;
        int totalDigits = 0;
        int sum = 0;
        lastDigit = number % 10;
        totalDigits = findDigits(number);
        divisor = (int) Math.pow(10, totalDigits - 1);
        firstDigit = number / divisor;
        sum = firstDigit + lastDigit;

        return sum;
    }
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;

    }


}
