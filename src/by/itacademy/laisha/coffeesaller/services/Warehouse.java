package by.itacademy.laisha.coffeesaller.services;

import by.itacademy.laisha.coffeesaller.entities.*;
import by.itacademy.laisha.coffeesaller.utils.ScreenUtils;
import by.itacademy.laisha.coffeesaller.utils.WarehouseUtils;

public class Warehouse {

    private static Coffee coffee = new Coffee();
    private static ScreenUtils screenUtil = new ScreenUtils();
    private static WarehouseUtils warehouseUtil = new WarehouseUtils();

    public Warehouse() {
    }

    public void loadWarehouseDataBase() {
        // tea.loadTeaDataBase(); will be used to expand the program
        // water.loadWaterDataBase(); will be used to expand the program
        coffee.loadCoffeeDataBase();
        screenUtil.printString("Warehouse database had loaded.");
    }
}

