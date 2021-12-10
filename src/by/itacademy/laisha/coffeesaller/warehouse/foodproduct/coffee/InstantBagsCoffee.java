package by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee;

public class InstantBagsCoffee extends Coffee {

    private final static String CoffeePhysicalCondition = "4 - Instant bags coffee";

    public InstantBagsCoffee(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity, int typeNumberOfCoffeePhysicalCondition) {
        super(foodProductVolume, foodProductWeight, foodProductCost, foodProductQuantity, typeNumberOfCoffeePhysicalCondition);
    }

    @Override
    public String getCoffeePhysicalCondition() {
        return CoffeePhysicalCondition;
    }
}
