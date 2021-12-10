package by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee;

public class BeanCoffee extends Coffee {

    private final static String CoffeePhysicalCondition = "1 - Bean coffee";

    public BeanCoffee(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity, int typeNumberOfCoffeePhysicalCondition) {
        super(foodProductVolume, foodProductWeight, foodProductCost, foodProductQuantity, typeNumberOfCoffeePhysicalCondition);
    }

    @Override
    public String getCoffeePhysicalCondition() {
        return CoffeePhysicalCondition;
    }
}
