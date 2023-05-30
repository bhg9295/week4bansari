package cylinder;

public class Cylinder extends Circle {
    // instance variable
    private double height;

    // constructor with two parameters
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // instance method without any parameters
    public double getHeight() {
        return height;
    }

    // instance method without any parameters
    public double getVolume() {
        return (getArea() * height);
    }
}




