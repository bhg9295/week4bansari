package homeWorkweek4;

/* Palindrome Number
        Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.*/
public class PalindromeNumber {
    public static void main(String[] args) {

        int i = 1221;

        System.out.println((isPalindrome(1001)));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;

    }


}