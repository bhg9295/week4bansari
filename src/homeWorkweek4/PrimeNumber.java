package homeWorkweek4;
//to input any number and check if it is prime or not.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        boolean ans;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s1.nextInt();
        for (int i =2; i <= n/2; ++i){
            if (n % i == 0){
                ans = true;
            }

        }
        if (!true)
            System.out.println(n + " is a prime number");
            System.out.println(n + " is not prime number");
    }
}
