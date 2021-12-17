package by.itacademy.laisha.coffeesaller.utils;

import by.itacademy.laisha.coffeesaller.entities.CargoVan;
import by.itacademy.laisha.coffeesaller.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TransportUtils {

    private static final int VEHICLE_TABLE_WIDTH = 70;
    private static final CargoVan cargoVan = new CargoVan();
    private static final MenuUtils menuUtil = new MenuUtils();
    private static final ScreenUtils screenUtil = new ScreenUtils();
    private static ArrayList<CargoVan> cargoVans = new ArrayList<>();


    public TransportUtils() {
    }

    public void addNewCargoVan(String vehicleBrand, String vehicleModel, String vehicleRegisterSign, double vehicleVolume) {
        cargoVan.addCargoVan(vehicleBrand, vehicleModel, vehicleRegisterSign, vehicleVolume);
    }

    public boolean workInTransportMenu() {
        boolean returningInMainMenu;
        int transportMenuItemSelection = menuUtil.getTransportMenuItemSelection();
        if (transportMenuItemSelection != 4) {
            switch (transportMenuItemSelection) {
                case 1: {
                    showCargoVans();
                    break;
                }
                case 2: {
                    showFreeCargoVans();
                    break;
                }
                case 3: {
                    addNewCargoVan(menuUtil.addNewVehicleBrand(), menuUtil.addNewVehicleModel(), menuUtil.addNewVehicleMark(), menuUtil.addNewVehicleVolume());
                    break;
                }
            }
            returningInMainMenu = false;
        } else {
            returningInMainMenu = true;
        }
        return returningInMainMenu;
    }


    private void showCargoVans() {
        int item = 1;
        cargoVans = cargoVan.getCargoVans();
        screenUtil.printString("There are all vehicles:");
        screenUtil.printVehicleTableHeader();
        for (CargoVan cargoVan : cargoVans) {
            screenUtil.printVehicle(item, cargoVan.getVehicleBrand(), cargoVan.getVehicleModel(), cargoVan.getVehicleRegisterSign(), cargoVan.getVehicleVolume());
            item++;
        }
        screenUtil.printFoodProductTableBottom(VEHICLE_TABLE_WIDTH);
    }

    private void showFreeCargoVans() {
        int item = 1;
        cargoVans = cargoVan.getCargoVans();
        screenUtil.printString("There are free vehicles:");
        screenUtil.printVehicleTableHeader();
        for (CargoVan cargoVan : cargoVans) {
            if (cargoVan.getAvailability()) {
                screenUtil.printVehicle(item, cargoVan.getVehicleBrand(), cargoVan.getVehicleModel(), cargoVan.getVehicleRegisterSign(), cargoVan.getVehicleVolume());
                item++;
            }
        }
        if (item == 1) {
            screenUtil.printString("Unfortunately, there are not free vehicles.");
        }
        screenUtil.printFoodProductTableBottom(VEHICLE_TABLE_WIDTH);
    }
}
