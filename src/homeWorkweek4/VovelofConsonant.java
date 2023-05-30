package homeWorkweek4;
/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.*/
import java.util.Scanner;

public class VovelofConsonant {


        public static void main(String[] args) {
           Scanner s = new Scanner(System.in);

            System.out.print("Please Provide single character from the alphabet: ");
            String letter = s.next();

            if (!letter.matches("[A-Za-z]")) {
                System.out.println("Error");
            } else {
                letter = letter.toLowerCase();
                if (letter.matches("[a e i o u]")) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }
        }
    }

