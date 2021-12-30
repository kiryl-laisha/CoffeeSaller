package by.itacademy.laisha.foodproductseller.entities;

import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;

public class Coffee extends FoodProduct {

    public Coffee(String CoffeeType, String CoffeeBrand, int CoffeeQuantity,
                  double CoffeePrice, double CoffeeWeight, double CoffeeVolume) {
        super(FoodProductClasses.COFFEE.getProductClass(), CoffeeType, CoffeeBrand,
                CoffeeQuantity, CoffeePrice, CoffeeWeight, CoffeeVolume);
    }
}

