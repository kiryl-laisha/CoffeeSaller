package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.*;

import java.util.ArrayList;

public class WarehouseUtils {

    private static ArrayList<Coffee> coffees;
    private static ArrayList<Coffee> orderingCoffees;

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

    public static void saveFoodProductDatabases() {

        Logger.log("Entered the method WarehouseUtils.saveFoodProductDatabases();");
        // FoodProductUtils.saveTeasDatabase(); will be used to expand the program
        // FoodProductUtils.saveWaterDatabase(); will be used to expand the program
        FoodProductUtils.saveCoffeeDatabase();
        Logger.log("The food product databases have been saved;\n" +
                "Exited the method WarehouseUtils.saveFoodProductDatabases();");
    }

    public static ArrayList<Coffee> getCoffees() {
        ArrayList<Coffee> copyCoffees = new ArrayList<>();
        copyCoffees.addAll(coffees);
        return copyCoffees;
    }

    public static void formOrder() {

        Logger.log("Entered the method WarehouseUtils.formOrder();");
        orderForming:
        {
            int selectedPositionItem;
            int selectedPositionQuantity;
            ArrayList<Coffee> remainingCoffees = new ArrayList<>();
            orderingCoffees = new ArrayList<>();

            remainingCoffees.addAll(getCoffees());
            do {
                printCoffeeTableWithChosenSorting("remaining", remainingCoffees);
                selectedPositionItem = getSelectedPositionItemForOrderAdding(remainingCoffees);
                selectedPositionQuantity = MenuUtils.getSelectedPositionQuantity(
                        selectedPositionItem, remainingCoffees);
                if (selectedPositionQuantity != 0) {
                    Coffee coffee = getCoffeePositionForOrderAdding(selectedPositionItem,
                            selectedPositionQuantity, remainingCoffees);
                    addCoffeeToOrder(coffee);
                    removeOrderAddingCoffeeFromWarehouse(selectedPositionItem,
                            selectedPositionQuantity, remainingCoffees);
                }
                printOrderParameters();
                printCoffeeTableWithChosenSorting("ordering", orderingCoffees);
                ScreenUtils.printFramedString(
                        " The class \"Coffee\" order.\n" +
                                " Please, choice your action:\n" +
                                " 1 - Continue to form the order;\n" +
                                " 2 - Set the order;");
                switch (MenuUtils.getSelectedItem(2)) {
                    case 1:
                        break;
                    case 2:
                        setOrder(remainingCoffees);
                        checkOrder();
                        break orderForming;
                }
            }
            while (true);
        }
        Logger.log("Exited the method WarehouseUtils.formOrder();");
    }

    private static void printOrderParameters() {

        int totalOrderQuantity = 0;
        double totalOrderCost = 0.;
        double totalOrderWeight = 0.;
        double totalOrderVolume = 0.;

        Logger.log("Entered the method WarehouseUtils.printOrderParameters();");
        for (Coffee coffee : orderingCoffees) {
            totalOrderQuantity = totalOrderQuantity + coffee.getFoodProductQuantity();
            totalOrderCost = totalOrderCost + coffee.getFoodProductQuantity() * coffee.getFoodProductPrice();
            totalOrderWeight = totalOrderWeight + coffee.getFoodProductQuantity() * coffee.getFoodProductWeight();
            totalOrderVolume = totalOrderVolume + coffee.getFoodProductQuantity() * coffee.getFoodProductVolume();
        }
        ScreenUtils.printStrip();
        ScreenUtils.printString( " An order parameters:\n" +
                " a total order quantity = " + totalOrderQuantity + " things;\n" +
                " a total order cost = " + totalOrderCost + " $;\n" +
                " a total order weight = " + totalOrderWeight/1000 + " kilogram;\n" +
                " a total order volume = " + totalOrderVolume + " m3;");
        Logger.log("Exited the method WarehouseUtils.printOrderParameters();");
    }

    private static void checkOrder() {

        Logger.log("Entered the method WarehouseUtils.checkOrder();");
        //printCoffeeTableWithChosenSorting("ordering", orderingCoffees);
        ScreenUtils.printFramedString(" To analise the order:\n" +
                " 1 - yes;\n" +
                " 2 - no;");
        switch (MenuUtils.getSelectedItem(2)) {
            case 1:
                analyzeOrder();
            case 2:
                break;
        }
        Logger.log("Exited the method WarehouseUtils.checkOrder();");
    }

    private static void analyzeOrder() {

        Logger.log("Entered the method WarehouseUtils.analyzeOrder();");
        ScreenUtils.printFramedString("Unfortunately, this " +
                "chapter has not been developed yet.");
        Logger.log("Exited the method WarehouseUtils.analyzeOrder();");
    }

    private static void printCoffeeTableWithChosenSorting(String descriptionName, ArrayList<Coffee> coffees) {
        sorting:
        {
            do {
                ScreenUtils.printCoffeesTable(
                        " The class \"Coffee\" " + descriptionName + " positions.", coffees);
                ScreenUtils.printFramedString(" Sort the class \"Coffee\" " + descriptionName + " positions:\n" +
                        " 1 - yes;\n" +
                        " 2 - no;");
                switch (MenuUtils.getSelectedItem(2)) {
                    case 1:
                        MenuUtils.choiceCoffeeClassSorting(descriptionName + " ", coffees);
                    case 2:
                        break sorting;
                }

            } while (true);
        }
    }

    private static int getSelectedPositionItemForOrderAdding(ArrayList<Coffee> coffees) {

        int selectedPositionItem;
        Logger.log("Entered the method WarehouseUtils.getSelectedPositionItemForOrderAdding();");
        ScreenUtils.printFramedString(" Please select the position item you want to add to the order:\n" +
                " (for back - select any exist position and then select a quantity 0)");
        selectedPositionItem = MenuUtils.getSelectedItem(coffees.size());
        Logger.log("Exited the method WarehouseUtils.getSelectedPositionItemForOrderAdding();");
        return selectedPositionItem;
    }

    private static Coffee getCoffeePositionForOrderAdding(int selectedPositionItem, int selectedPositionQuantity,
                                                          ArrayList<Coffee> remainingCoffees) {

        Logger.log("Entered the method WarehouseUtils.getCoffeePositionForOrderAdding.formOrder();");
        Coffee coffee = new Coffee(remainingCoffees.get(selectedPositionItem - 1).getFoodProductType(),
                remainingCoffees.get(selectedPositionItem - 1).getFoodProductBrand(),
                selectedPositionQuantity,
                remainingCoffees.get(selectedPositionItem - 1).getFoodProductPrice(),
                remainingCoffees.get(selectedPositionItem - 1).getFoodProductWeight(),
                remainingCoffees.get(selectedPositionItem - 1).getFoodProductVolume());
        Logger.log("Exited the method WarehouseUtils.getCoffeePositionForOrderAdding.formOrder();");
        return coffee;
    }

    private static void addCoffeeToOrder(Coffee coffee) {

        int coincidentalElementIndex = -1;
        Logger.log("Entered the method WarehouseUtils.addCoffeeToOrder();");
        if (orderingCoffees.isEmpty()) {
            orderingCoffees.add(coffee);
        } else {
            for (Coffee temporaryCoffee : orderingCoffees) {
                if (coffee.getFoodProductType().equals(temporaryCoffee.getFoodProductType()) &&
                        coffee.getFoodProductBrand().equals(temporaryCoffee.getFoodProductBrand()) &&
                        Double.compare(coffee.getFoodProductPrice(), temporaryCoffee.getFoodProductPrice()) == 0 &&
                        Double.compare(coffee.getFoodProductWeight(), temporaryCoffee.getFoodProductWeight()) == 0 &&
                        Double.compare(coffee.getFoodProductVolume(), temporaryCoffee.getFoodProductVolume()) == 0) {
                    coincidentalElementIndex = orderingCoffees.indexOf(temporaryCoffee);
                    break;
                }
            }
            if (coincidentalElementIndex == -1) {
                orderingCoffees.add(coffee);
            } else {
                orderingCoffees.get(coincidentalElementIndex).setFoodProductQuantity(
                        orderingCoffees.get(coincidentalElementIndex).getFoodProductQuantity() +
                                coffee.getFoodProductQuantity());
            }
        }
        Logger.log("Exited the method WarehouseUtils.addCoffeeToOrder();");
    }

    private static void setOrder(ArrayList<Coffee> remainingCoffees) {

        Logger.log("Entered the method WarehouseUtils.setOrder();");
        ScreenUtils.printStrip();
        ScreenUtils.printString("The order has been set successfully.");
        coffees.clear();
        coffees.addAll(remainingCoffees);
        Logger.log("Exited the method WarehouseUtils.setOrder();");
    }

    private static void removeOrderAddingCoffeeFromWarehouse(
            int selectedPositionItem, int selectedPositionQuantity, ArrayList<Coffee> remainingCoffees) {

        Logger.log("Entered the method WarehouseUtils.removeOrderAddingCoffeeFromWarehouse();");
        remainingCoffees.get(selectedPositionItem - 1).setFoodProductQuantity(
                remainingCoffees.get(selectedPositionItem - 1).getFoodProductQuantity() -
                        selectedPositionQuantity);
        Logger.log("Exited the method WarehouseUtils.removeOrderAddingCoffeeFromWarehouse();");
    }

}
