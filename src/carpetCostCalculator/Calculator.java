package carpetCostCalculator;

public class Calculator {
    // instance variable
    private Floor floor;
    private Carpet carpet;

    // constructor with two parameter
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // instance method
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}


