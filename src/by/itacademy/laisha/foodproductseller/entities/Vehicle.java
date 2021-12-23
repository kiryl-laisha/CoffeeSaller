package by.itacademy.laisha.foodproductseller.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleRegisterSign;
    private double vehicleVolume;
    private boolean availability;

    private static List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle() {
    }

    public Vehicle(String vehicleBrand, String vehicleModel, String vehicleRegisterSign, double vehicleVolume) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleRegisterSign = vehicleRegisterSign;
        this.vehicleVolume = vehicleVolume;
        availability = true;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleBrand() {
        return this.vehicleBrand;
    }

    public void setVehicleModel(String vehicleBrand) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public void setVehicleRegisterSign(String vehicleRegisterSign) {
        this.vehicleRegisterSign = vehicleRegisterSign;
    }

    public String getVehicleRegisterSign() {
        return this.vehicleRegisterSign;
    }

    public void setVehicleVolume(double vehicleVolume) {
        this.vehicleVolume = vehicleVolume;
    }

    public double getVehicleVolume() {
        return this.vehicleVolume;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean getAvailability() {
        return this.availability;
    }
}
