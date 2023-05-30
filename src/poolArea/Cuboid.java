package poolArea;

public class Cuboid extends  Rectangle {


    // instance variable
    private double height;

    // constructor with three parameters
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    // instance method without any parameters
    public double getHeight(){
        return height;
    }

    // instance method without any parameters
    public double getVolume(){
        return (getArea() * height);
    }

}