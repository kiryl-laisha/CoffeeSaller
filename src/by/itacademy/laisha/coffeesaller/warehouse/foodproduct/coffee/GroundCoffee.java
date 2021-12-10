package by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee;

public class GroundCoffee extends Coffee {

    private final static String CoffeePhysicalCondition = "2 - Ground coffee";

    public GroundCoffee(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity, int typeNumberOfCoffeePhysicalCondition) {
        super(foodProductVolume, foodProductWeight, foodProductCost, foodProductQuantity, typeNumberOfCoffeePhysicalCondition);
    }

    @Override
    public String getCoffeePhysicalCondition() {
        return CoffeePhysicalCondition;
    }
}
