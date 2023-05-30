package homeWorkweek4;
// right angle triangle of @ using nested for loops
public class RightTriangleofNestedloops {
    public void m1() {


        int n = 5;
        int a, b;
        for (a = 0; a <= n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@ " + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangleofNestedloops obj = new RightTriangleofNestedloops();
        obj.m1();
    }
}
