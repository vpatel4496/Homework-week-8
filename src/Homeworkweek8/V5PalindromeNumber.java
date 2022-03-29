package Homeworkweek8;

public class V5PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(-1221); // True
        isPalindrome(707);  // True
        isPalindrome(11212); // False
        isPalindrome(121);  // True
        isPalindrome(105051); // False

    }
        public static boolean isPalindrome(int number) {
            int remainder;
            int reversenumber = 0;
            int originalNum = number;
            while (number != 0) {
                remainder = number % 10;
                reversenumber = reversenumber * 10 + remainder;
                number /= 10;

            }
            if (originalNum == reversenumber) {
                System.out.println(originalNum + " is Palindrome number ");
                return true;
            }else{
                System.out.println(originalNum + " is not Palindrome number ");
                return false;


            }


        }

}
