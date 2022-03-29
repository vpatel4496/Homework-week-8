package Homeworkweek8;

public class V4DigitSumChallenge {
    public static void main(String[] args) {
        sumDigit(125);
    }

    public static void sumDigit(int number) {
        int sum = 0;
        if (number<10 && number>0){
            System.out.println("-1");
        } else {
            for (sum = 0; number != 0; number = number / 10) {
                sum = sum + number % 10;
            }
            System.out.println(+sum);

        }

    }

}
