package by.itacademy.laisha.coffeesaller.services;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.laisha.coffeesaller.entities.CargoVan;
import by.itacademy.laisha.coffeesaller.utils.MenuUtils;
import by.itacademy.laisha.coffeesaller.utils.ScreenUtils;
import by.itacademy.laisha.coffeesaller.entities.Vehicle;
import by.itacademy.laisha.coffeesaller.utils.*;

public class Manager {
    private static MenuUtils menuUtil = new MenuUtils();
    private static ScreenUtils screenUtils = new ScreenUtils();
    private static Transport transport = new Transport();
    private static TransportUtils transportUtils = new TransportUtils();
    private static Warehouse warehouse = new Warehouse();
    private static WarehouseUtils warehouseUtils = new WarehouseUtils();


    public Manager() {
        createDataBase();
    }

    public void createDataBase() {
        screenUtils.printString("Your access level - manager.");
        warehouse.loadWarehouseDataBase();
        transport.loadTransportDatabase();
    }

    public boolean workInMainMenu() {
        boolean exit = false;
        switch (menuUtil.getMainMenuItemSelection()) {
            case 1: {
                while (!transportUtils.workInTransportMenu()) {
                }
                break;
            }
            case 2: {
                while (!warehouseUtils.workInWarehouseMenu()) {
                }
                break;
            }
            case 3: {
                while (!warehouseUtils.workInCollectionMenu()) {
                }
                break;
            }
            case 4: {
                exit = true;
                break;
            }
        }
        return exit;
    }


    private void showFoodProduct() {
        int item = 1;
        //vehicles = transport.getVehicles();
        screenUtils.printString("There are all our vehicles:");
        // for (Vehicle vehicle : vehicles) {
        //    screenUtils.printVehicle(item, vehicle.getVehicleParameters(), vehicle.getVehicleVolume());
        item++;
    }

}



