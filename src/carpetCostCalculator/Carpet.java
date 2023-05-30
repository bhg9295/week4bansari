package carpetCostCalculator;

public class Carpet {
    // instance variable
    private double cost;

    // constructor with one parameter
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // instance method
    public double getCost(){
        return this.cost;
    }

}
