package by.itacademy.laisha.coffeesaller.entities;

import java.util.ArrayList;
import java.util.List;

public class CargoVan extends Vehicle {

    private static ArrayList<CargoVan> cargoVans = new ArrayList<>();

    public CargoVan() {
        super();
    }

    public CargoVan(String vehicleBrand, String vehicleModel, String vehicleRegisterSign, double vehicleVolume) {
        super(vehicleBrand, vehicleModel, vehicleRegisterSign, vehicleVolume);
    }

    public void loadCargoVanDataBase() {
        addCargoVan("Iveco", "Daily", "AK 5432-7", 7.5);
        addCargoVan("Gazel", "Next", "AC 0243-7", 9.0);
        addCargoVan("Mercedes", "Sprinter", "AH 9919-7", 11.5);
    }

    public void addCargoVan(String vehicleBrand, String vehicleModel, String vehicleRegisterSign, double vehicleVolume) {
        CargoVan cargoVan = new CargoVan(vehicleBrand, vehicleModel, vehicleRegisterSign, vehicleVolume);
        cargoVans.add(cargoVan);
    }

    public ArrayList<CargoVan> getCargoVans() {
        return cargoVans;
    }
}
