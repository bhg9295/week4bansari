package homeWorkweek4;
// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Fibonaccinumber {


        public void number() {
            int n = 30, firstTerm = 1, secondTerm = 1;
            System.out.println("Fibonacci Series Upto " + n + ": ");
            while (firstTerm <= n) {
                System.out.print(firstTerm + ", ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

       }
       public static void main(String[] args) {
            Fibonaccinumber obj =new Fibonaccinumber();
            obj.number();
    }
}
