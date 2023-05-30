package poolArea;

public class Rectangle {
    // instance variable
    private double width;
    private double length;

    // constructor with parameters width and length
    public Rectangle (double width, double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        }  else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        }  else {
            this.width = width;
            this.length = length;
        }
    }

    // instance method without any parameters
    public double getWidth(){
        return width;
    }

    // instance method without any parameters
    public double getLength(){
        return length;
    }

    // instance method without any parameters,
    public double getArea(){
        return (width * length);
    }
}






