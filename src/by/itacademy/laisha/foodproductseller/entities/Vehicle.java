package by.itacademy.laisha.foodproductseller.entities;

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
}
