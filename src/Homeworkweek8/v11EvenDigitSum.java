package Homeworkweek8;

public class v11EvenDigitSum {
    public static void main(String[] args) {
        evendigit(123456789);
        evendigit(252);
        evendigit(-22);
    }
    public static void evendigit(int number) {
        int originalNumber = number;
        int digit, sum = 0;
        if (number > 0) {
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;


            }
            System.out.println("sum of all evendigit number " + originalNumber + "is :" + sum);
            System.out.println("-1");
        }

    }
}
