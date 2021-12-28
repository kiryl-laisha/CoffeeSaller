package by.itacademy.laisha.foodproductseller.entities;

import by.itacademy.laisha.foodproductseller.enums.VehicleTypes;

import java.util.Comparator;

public class Cargovan extends Vehicle implements Comparable<Cargovan>, Comparator<Cargovan> {

    private double cargovanVolume;

    public Cargovan(String cargovanBrand, String cargovanModel,
                    String cargovanRegisterSign, double cargovanVolume, boolean cargovanAvailability) {
        super(VehicleTypes.CARGOVAN.getVehicleType(), cargovanBrand, cargovanModel,
                cargovanRegisterSign, cargovanAvailability);
        this.cargovanVolume = cargovanVolume;
    }

    public void setCargovanVolume(double cargovanVolume) {
        this.cargovanVolume = cargovanVolume;
    }

    public double getCargovanVolume() {
        return this.cargovanVolume;
    }

    @Override
    public int compareTo(Cargovan cargovan) {
        return Double.compare(this.getCargovanVolume(), cargovan.getCargovanVolume());
    }

    @Override
    public int compare(Cargovan cargovan1, Cargovan cargovan2) {
        return Boolean.compare(cargovan1.getVehicleAvailability(), cargovan2.getVehicleAvailability());
    }
}
