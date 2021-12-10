package by.itacademy.laisha.coffeesaller.utils;

import by.itacademy.laisha.coffeesaller.transportservice.TransportService;
import by.itacademy.laisha.coffeesaller.transportservice.Vehicle;

import java.util.List;

public class TransportServiceUtils {
    TransportService transportService = new TransportService();

    public TransportServiceUtils() {
    }

    public void loadTransportServiceDataBase() {
        transportService.loadTransportServiceDataBase();
    }

    public List<Vehicle> getVehicles() {
        return transportService.getVehicles();
    }
}
