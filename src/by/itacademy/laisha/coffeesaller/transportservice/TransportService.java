package by.itacademy.laisha.coffeesaller.transportservice;

import by.itacademy.laisha.coffeesaller.screen.Screen;

import java.util.ArrayList;
import java.util.List;

public class TransportService {

    private static Screen screen;
    private List<Vehicle> vehicles = new ArrayList<>();

    public TransportService() {
        addVehicle("Ford Transit, AK 5432-7", 5.5);
    }

    public void loadTransportServiceDataBase() { //emulation
        screen.printScreen("TransportService database had loaded.");
    }

    public void addVehicle(String vehicleModel , double vehicleVolume) {
        Vehicle vehicle = new Vehicle(vehicleModel, vehicleVolume);
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
