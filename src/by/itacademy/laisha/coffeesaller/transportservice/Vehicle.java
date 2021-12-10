package by.itacademy.laisha.coffeesaller.transportservice;

public class Vehicle {

    private String vehicleBrand;
    private double vehicleVolume;

    public Vehicle(String vehicleModel , double vehicleVolume) {
        this.vehicleBrand = vehicleModel;
        this.vehicleVolume = vehicleVolume;
    }

    public void setVehicleVolume(double vehicleVolume) {
        this.vehicleVolume = vehicleVolume;
    }

    public double getVehicleVolume() {
        return vehicleVolume;
    }

}
