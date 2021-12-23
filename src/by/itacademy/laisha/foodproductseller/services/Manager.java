package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.utils.*;

public class Manager {
    private static MenuUtils menuUtil = new MenuUtils();
    private static ScreenUtils screenUtils = new ScreenUtils();
    private static Transport transport = new Transport();
    private static TransportUtils transportUtils = new TransportUtils();
    private static WarehouseUtils warehouseUtils = new WarehouseUtils();

       // databases loading
    public static void loadDatabases() {
        Warehouse.loadWarehouseDatabase();
        transport.loadTransportDatabase();
    }

    public static boolean workInMainMenu() {
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



