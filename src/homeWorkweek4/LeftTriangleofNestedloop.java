package homeWorkweek4;
//left angle triangle of * using nested for loops
public class LeftTriangleofNestedloop {

    public void left () {
        printLeftTriange(5);

    }

    public static void printLeftTriange(int a) {
        for (int i=0; i<a+1 ; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("  *");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LeftTriangleofNestedloop obj = new LeftTriangleofNestedloop();
        obj.left();
    }
}
