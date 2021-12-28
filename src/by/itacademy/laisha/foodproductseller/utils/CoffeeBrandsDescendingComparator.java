package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;

import java.util.Comparator;

public class CoffeeBrandsDescendingComparator implements Comparator<Coffee> {

    @Override
    public int compare(Coffee firstCoffee, Coffee secondCoffee) {

        return secondCoffee.getFoodProductBrand().compareTo(firstCoffee.getFoodProductBrand());
    }
}
