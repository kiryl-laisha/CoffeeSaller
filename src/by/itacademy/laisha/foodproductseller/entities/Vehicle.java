package by.itacademy.laisha.foodproductseller.entities;

import java.util.Objects;

public abstract class Vehicle {

    private static final String TRANSPORT_CLASS = "Vehicle";
    private String vehicleType;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleRegisterSign;
    private boolean vehicleAvailability;

    public Vehicle(String vehicleType, String vehicleBrand, String vehicleModel,
                   String vehicleRegisterSign, boolean vehicleAvailability) {
        this.vehicleType = vehicleType;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleRegisterSign = vehicleRegisterSign;
        this.vehicleAvailability = vehicleAvailability;
    }

    public static String getTransportClass() {
        return TRANSPORT_CLASS;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleBrand() {
        return this.vehicleBrand;
    }

    public void setVehicleModel(String vehicleModel) {
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

    public void setVehicleAvailability(boolean vehicleAvailability) {
        this.vehicleAvailability = vehicleAvailability;
    }

    public boolean getVehicleAvailability() {
        return this.vehicleAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleAvailability == vehicle.vehicleAvailability &&
                vehicleType.equals(vehicle.vehicleType) &&
                vehicleBrand.equals(vehicle.vehicleBrand) &&
                vehicleModel.equals(vehicle.vehicleModel) &&
                vehicleRegisterSign.equals(vehicle.vehicleRegisterSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, vehicleBrand, vehicleModel, vehicleRegisterSign, vehicleAvailability);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleRegisterSign='" + vehicleRegisterSign + '\'' +
                ", vehicleAvailability=" + vehicleAvailability +
                '}';
    }
}

