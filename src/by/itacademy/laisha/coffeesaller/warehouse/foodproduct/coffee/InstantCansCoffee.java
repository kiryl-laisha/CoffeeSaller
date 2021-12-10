package by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee;

public class InstantCansCoffee extends Coffee {

    private final static String CoffeePhysicalCondition = "3 - Instant cans coffee";

    public InstantCansCoffee(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity, int typeNumberOfCoffeePhysicalCondition) {
        super(foodProductVolume, foodProductWeight, foodProductCost, foodProductQuantity, typeNumberOfCoffeePhysicalCondition);
    }

    @Override
    public String getCoffeePhysicalCondition() {
        return CoffeePhysicalCondition;
    }
}
