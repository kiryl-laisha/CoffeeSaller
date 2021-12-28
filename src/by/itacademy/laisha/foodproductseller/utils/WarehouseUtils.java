package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.*;

import java.util.ArrayList;

public class WarehouseUtils {

    private static ArrayList<Coffee> coffees;

    private static ArrayList<Coffee> orderedCoffees;
    private static ArrayList<Coffee> remainingCoffees;

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
        remainingCoffees = new ArrayList<>();
        orderedCoffees = new ArrayList<>();
        remainingCoffees.addAll(getCoffees());
        do {


            ScreenUtils.printCoffeesTable(" The class \"Coffee\" remaining positions.", remainingCoffees);
            ScreenUtils.printFramedString(" Please select the position item you want to add to the order:");
            int selectedPositionItem = MenuUtils.getSelectedItem(remainingCoffees.size());
            int selectedPositionQuantity = MenuUtils.getChosenPositionQuantity(selectedPositionItem, remainingCoffees);
            if (selectedPositionQuantity != 0) {
                orderedCoffees.add(new Coffee(remainingCoffees.get(selectedPositionItem - 1).getFoodProductType(),
                        remainingCoffees.get(selectedPositionItem - 1).getFoodProductBrand(),
                        selectedPositionQuantity,
                        remainingCoffees.get(selectedPositionItem - 1).getFoodProductPrice(),
                        remainingCoffees.get(selectedPositionItem - 1).getFoodProductWeight(),
                        remainingCoffees.get(selectedPositionItem - 1).getFoodProductVolume()));
                remainingCoffees.get(selectedPositionItem - 1).setFoodProductQuantity
                        (remainingCoffees.get(selectedPositionItem - 1).getFoodProductQuantity() - selectedPositionQuantity);
            }
        } while (true);
        //choicePositionForOrder();
    }
}
