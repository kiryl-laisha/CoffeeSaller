package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.entities.*;
import by.itacademy.laisha.foodproductseller.utils.*;

public class Warehouse {

    //
    public static void loadWarehouseDatabase() {
        // tea.loadTeaDatabase(); will be used to expand the program
        // water.loadWaterDatabase(); will be used to expand the program
        Coffee.loadCoffeeDatabase();
        ScreenUtils.printFramedString("Warehouse database has been loaded.");
    }
}

