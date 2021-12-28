package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Cargovan;
import by.itacademy.laisha.foodproductseller.entities.Coffee;

import java.util.ArrayList;

public class ScreenUtils {

    private static final int FOOD_PRODUCT_TABLE_WIDTH = 112;
    private static final int CARGOVAN_TABLE_WIDTH = 85;
    private static final int STRIP_WIDTH = 200;

    public static void printString(String string) {
        System.out.println(string);
    }

    public static void printFramedString(String string) {
        System.out.println("-".repeat(STRIP_WIDTH));
        System.out.println(string);
        System.out.println("-".repeat(STRIP_WIDTH));
    }

    public static void printStrip() {
        System.out.println("-".repeat(STRIP_WIDTH));
    }

    public static void printCoffeesTable(String tableName, ArrayList<Coffee> coffees) {

        int itemCounter = 0;

        Logger.log("Entered the method ScreenUtils.printCoffeeTable();");
        printStrip();
        printString(tableName);
        printFoodProductTableHeader();
        for (Coffee coffee : coffees) {
            itemCounter++;
            printFoodProduct(itemCounter, coffee.getFoodProductType(), coffee.getFoodProductBrand(),
                    coffee.getFoodProductQuantity(), coffee.getFoodProductPrice(),
                    coffee.getFoodProductWeight(), coffee.getFoodProductVolume());
        }
        printTableBottom(FOOD_PRODUCT_TABLE_WIDTH);
        Logger.log("Exited the method ScreenUtils.printCoffeeTable();");
    }

    private static void printFoodProductTableHeader() {
        System.out.println(" " + "-".repeat(FOOD_PRODUCT_TABLE_WIDTH));
        System.out.println(" | # |         Type        |             Brand           |  Quantity, |" +
                " Price, |    Cost,  |  Weight,|  Volume, |");
        System.out.println(" |   |                     |                             |   things   |" +
                "   $    |      $    |   gram  |     m3   |");
        System.out.println(" " + "-".repeat(FOOD_PRODUCT_TABLE_WIDTH));
    }

    private static void printFoodProduct(int item, String foodProductType, String foodProductBrand,
                                         int foodProductQuantity, double foodProductPrice,
                                         double foodProductWeight, double foodProductVolume) {
        System.out.printf(" |% -3d|     %-16s|  %-27s|   %-9d| %-7.2f| %-10.2f|  %-7.1f| %-9.6f|\n",
                item, foodProductType, foodProductBrand, foodProductQuantity, foodProductPrice,
                foodProductQuantity * foodProductPrice, foodProductWeight, foodProductVolume);
    }

    private static void printTableBottom(int tableWidth) {
        System.out.println(" " + "-".repeat(tableWidth));
    }

    public static void printCargovansTable(String tableName, ArrayList<Cargovan> cargovans) {

        int itemCounter = 0;

        Logger.log("Entered the method ScreenUtils.printCargovansTable();");
        printStrip();
        printString(tableName);
        printCargovansTableHeader();
        for (Cargovan cargovan : cargovans) {
            itemCounter++;
            printCargovan(itemCounter, cargovan.getVehicleBrand(), cargovan.getVehicleModel(),
                    cargovan.getVehicleRegisterSign(), cargovan.getCargovanVolume(),
                    cargovan.getVehicleAvailability());
        }
        printTableBottom(CARGOVAN_TABLE_WIDTH);
        Logger.log("Exited the method ScreenUtils.printCargovansTable();");
    }

    private static void printCargovansTableHeader() {
        System.out.println(" " + "-".repeat(CARGOVAN_TABLE_WIDTH));
        System.out.println(" | # |     Brand     |     Model     |   Register sign   | Volume, m3 | Availability |");
        System.out.println(" " + "-".repeat(CARGOVAN_TABLE_WIDTH));
    }

    private static void printCargovan(int item, String cargovanBrand, String cargovanModel,
                                      String cargovanRegisterSign, double cargovanVolume, boolean cargovanAvailability) {

        Logger.log("Entered the method ScreenUtils.printCargovan();");
        System.out.printf(" |% -3d|  %-13s|  %-13s|    %-15s|   %-9.1f|    %-10s|\n", item, cargovanBrand,
                cargovanModel, cargovanRegisterSign, cargovanVolume, cargovanAvailability);
        Logger.log("Exited the method ScreenUtils.printCargovan();");
    }

    public static void printFoodProductTypesForChoice(ArrayList<String> foodProductTypes, String foodProductClass) {

        Logger.log("Entered the method ScreenUtils.printFoodProductTypesForChoice();");
        printFramedString(" Adding a new position.\n" +
                " Please, choice a type of the class \"" + foodProductClass + "\":");
        for (String foodProductType : foodProductTypes) {
            System.out.printf(" %-2d - %-12s\n", foodProductTypes.indexOf(foodProductType) + 1, foodProductType);
        }
        Logger.log("Exited the method ScreenUtils.printFoodProductTypesForChoice();");
    }
}
