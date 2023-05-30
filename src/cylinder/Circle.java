package cylinder;

public class Circle {
    // instance variable
    private double radius;

    // constructor with one parameter
    public Circle (double radius){
        if (radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    // instance method without any parameters,
    public double getRadius(){
        return radius;
    }

    // instance method without any parameters,
    public double getArea(){
        return radius*radius*Math.PI;
    }


}
