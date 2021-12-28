package by.itacademy.laisha.foodproductseller.enums;

public enum VehicleTypes {
    CARGOVAN, MINIVAN, CAR;

    public String getVehicleType(){

        String VehicleTypes;
        switch (this) {
            case CARGOVAN:
                VehicleTypes = "Cargovan";
                break;
            case MINIVAN:
                VehicleTypes = "Minivan";
                break;
            case CAR:
                VehicleTypes = "Car";
                break;
            default:
                VehicleTypes = "Vehicle class hadn't been defined";
        }
        return VehicleTypes;
    }
}
