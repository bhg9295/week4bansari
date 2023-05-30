package homeWorkweek4;
// Java to display the pattern like a triangle with a number.
import java.util.Scanner;

public class TriangleWithNumber {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int r = sc.nextInt();
        TriangleWithNumber t = new TriangleWithNumber();
        t.pattern(r);

        sc.close();
    }

    public void pattern(int r) {


        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }
    }
}
