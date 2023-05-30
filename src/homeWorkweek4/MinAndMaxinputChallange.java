package homeWorkweek4;
// the console entered by the user and print the minimum
//and maximum number the user has entered
import java.util.Scanner;

public class MinAndMaxinputChallange {
    public static void main(String[] args) {


        int min, max;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        min = max = number;
        while (number != 0){
            System.out.println("enter a number");
            number= sc.nextInt();
            if(number<min){
                min = number;
            }
            if (number>max){
                max = number;
            }
            System.out.println("min:" +min);
            System.out.println("max:"+max);
        }


    }
}