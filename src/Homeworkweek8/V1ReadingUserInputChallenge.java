package Homeworkweek8;

import java.util.Scanner;

public class V1ReadingUserInputChallenge {

    public static void main(String[] args) {
        input();
    }
    public static void input() {
        int counter = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (counter <= 10) {
            System.out.println("Enter number " + counter + " : ");

            if (scan.hasNextInt()) {
                sum += scan.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }

        int count = counter - 1;
        System.out.println("Sum of entered number:" + sum);
        System.out.println("You have entered " + count + " numbers");

    }


}