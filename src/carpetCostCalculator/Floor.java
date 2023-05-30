package carpetCostCalculator;

public class Floor {
    // instance variable
    private double width, length;

    // constructor with two parameters width and length
    public Floor (double width, double length){
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

    // instance method without any parameters,
    public double getArea(){
        return (width * length);
    }
}


