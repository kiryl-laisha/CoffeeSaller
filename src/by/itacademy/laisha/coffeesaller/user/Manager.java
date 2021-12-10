package by.itacademy.laisha.coffeesaller.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.itacademy.laisha.coffeesaller.menu.Menu;
import by.itacademy.laisha.coffeesaller.screen.Screen;
import by.itacademy.laisha.coffeesaller.transportservice.Vehicle;
import by.itacademy.laisha.coffeesaller.utils.*;

public class Manager {
    private Screen screen = new Screen();
    private WarehouseUtils warehouseUtils = new WarehouseUtils();
    private TransportServiceUtils transportServiceUtils = new TransportServiceUtils();
    private List<Vehicle> vehicles = new ArrayList<>();

    public Manager() {
    }

    public void createDataBase() {
        screen.printScreen("Your access level - manager.");
        warehouseUtils.createWarehouseDataBase();
        transportServiceUtils.loadTransportServiceDataBase();
    }

    public void choiceMenu() {
        Menu menu = new Menu();
        switch (menu.getMenuItemSelection()) {
            case 1: {
                vehicles = transportServiceUtils.getVehicles();
                Iterator it = vehicles.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                screen.printScreen("Working on collections and DAO!");

            }
            case 2:
            case 3:

                break;

        }
    }
}

