package homeWorkweek4;
/*Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false*/
import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Outout : " +hasSharedDigit(15,23));
    }
    public static boolean hasSharedDigit(int numA,int numB){
        if((numA<10||numA>99)||(numB<10||numB>99)){
            return false;
        }
        int realNumB=numB;
        while(numA>0){
            int numADig=numA%10;
            while(numB>0){
                int numBDig=numB%10;
                if(numADig==numBDig){
                    return true;
                }
                numB=numB/10;
            }
            numA=numA/10;
            numB=realNumB;
        }
        return false;
}
}

