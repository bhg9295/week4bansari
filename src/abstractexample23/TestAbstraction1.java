package abstractexample23;

public class TestAbstraction1 {
    public static void main(String args []){
        Shape s = new Circle1();//  in a real scenario , object is provided though method e.g. getShape() method
        s.draw();
    }

}
