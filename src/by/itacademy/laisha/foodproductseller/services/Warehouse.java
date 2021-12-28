package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.entities.*;
import by.itacademy.laisha.foodproductseller.utils.*;

import java.util.ArrayList;

public class Warehouse {

    private static ArrayList<Coffee> coffees;

    public static void loadWarehouseDatabases() {

        Logger.log("Entered the method Warehouse.loadWarehouseDatabases();");
        WarehouseUtils.loadFoodProductDatabases();
        coffees = WarehouseUtils.getCoffees();
        ScreenUtils.printString("The warehouse databases have been loaded;");
        ScreenUtils.printStrip();
        Logger.log("The warehouse databases have been loaded;\n" +
                "Exited the method Warehouse.loadWarehouseDatabases();");
    }
}

