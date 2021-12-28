package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;

import java.util.Comparator;

public class CoffeeQuantitiesAscendingComparator implements Comparator<Coffee> {

    @Override
    public int compare(Coffee firstCoffee, Coffee secondCoffee) {

        return Integer.compare(firstCoffee.getFoodProductQuantity(), secondCoffee.getFoodProductQuantity());
    }
}