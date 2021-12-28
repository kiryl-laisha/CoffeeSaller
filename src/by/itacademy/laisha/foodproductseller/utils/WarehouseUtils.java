package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.*;

import java.util.ArrayList;

public class WarehouseUtils {

    private static ArrayList<Coffee> coffees;

    public WarehouseUtils() {
    }

    public static void loadFoodProductDatabases() {

        Logger.log("Entered the method WarehouseUtils.loadFoodProductDatabases();");
        // teas = FoodProductUtils.loadTeasDatabase(); will be used to expand the program
        // waters = FoodProductUtils.loadWaterDatabase(); will be used to expand the program
        coffees = FoodProductUtils.loadCoffeeDatabase();
        Logger.log("The food product databases have been loaded;\n" +
                "Exited the method WarehouseUtils.loadFoodProductDatabases();");
    }

    public static ArrayList<Coffee> getCoffees() {
        ArrayList<Coffee> copyCoffees = new ArrayList<>();
        copyCoffees.addAll(coffees);
        return copyCoffees;
    }


    public static void formOrder() {

        Logger.log("Entered the method WarehouseUtils.formOrder();");
        ScreenUtils.printCoffeesTable("\" The class \"Coffee\" positions.\"", WarehouseUtils.getCoffees());
    }
}
