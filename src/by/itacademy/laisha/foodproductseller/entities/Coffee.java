package by.itacademy.laisha.foodproductseller.entities;

import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;

public class Coffee extends FoodProduct implements Comparable<Coffee> {

    public Coffee(String CoffeeType, String CoffeeBrand, int CoffeeQuantity,
                  double CoffeePrice, double CoffeeWeight, double CoffeeVolume) {
        super(FoodProductClasses.COFFEE.getProductClass(), CoffeeType, CoffeeBrand,
                CoffeeQuantity, CoffeePrice, CoffeeWeight, CoffeeVolume);
    }

    @Override
    public int compareTo(Coffee coffee) {

        return this.getFoodProductType().compareTo(coffee.getFoodProductType());
    }
}

