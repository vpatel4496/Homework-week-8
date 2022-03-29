package Homeworkweek8;

import java.util.Scanner;

public class V2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {
        int min = 0;
        int max = 0;
        boolean ismin = false;
        boolean ismax = false;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number: ");
            if (input.hasNextInt()) {
                int num = input.nextInt();
                if (num > max || !ismax) {
                    max = num;
                    ismax = true;
                }
                if (num < min || !ismin) {
                    min = num;
                    ismin = true;
                }
            } else {
                System.out.println("minimum number is " + min);

                System.out.println("minimum number is " + max);
                break;
            }

        }


    }

}

