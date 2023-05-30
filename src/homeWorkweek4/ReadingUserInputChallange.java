package homeWorkweek4;

import java.util.Scanner;

public class ReadingUserInputChallange {


    // instance method
    public void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");

            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;    // sum = sum + number
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();  // Always return new userInput
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }

    public static void main(String[] args) {
        ReadingUserInputChallange input = new ReadingUserInputChallange();  // creating object
        input.sumOfNumbers();  // calling instance method using object
    }
}

