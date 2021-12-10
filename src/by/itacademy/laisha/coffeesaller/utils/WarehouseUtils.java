package by.itacademy.laisha.coffeesaller.utils;

import by.itacademy.laisha.coffeesaller.warehouse.Warehouse;

public class WarehouseUtils {

    public WarehouseUtils() {
    }

    public void createWarehouseDataBase() {
        Warehouse warehouse = new Warehouse();
        warehouse.loadWarehouseDataBase();
    }

}
