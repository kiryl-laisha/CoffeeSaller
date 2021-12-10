package by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee;

import by.itacademy.laisha.coffeesaller.warehouse.foodproduct.FoodProduct;

public class Coffee extends FoodProduct {

private int typeNumberOfCoffeePhysicalCondition;
private String CoffeePhysicalCondition;

    public Coffee(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity, int typeNumberOfCoffeePhysicalCondition) {
        super(foodProductVolume, foodProductWeight, foodProductCost, foodProductQuantity);
        this.typeNumberOfCoffeePhysicalCondition = typeNumberOfCoffeePhysicalCondition;
    }

    public String getCoffeePhysicalCondition() {
        return CoffeePhysicalCondition;
    }
}
