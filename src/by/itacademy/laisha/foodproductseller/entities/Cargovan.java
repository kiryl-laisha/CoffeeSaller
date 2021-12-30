package by.itacademy.laisha.foodproductseller.entities;

import by.itacademy.laisha.foodproductseller.enums.VehicleTypes;

import java.util.Comparator;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cargovan)) return false;
        if (!super.equals(o)) return false;
        Cargovan cargovan = (Cargovan) o;
        return Double.compare(cargovan.cargovanVolume, cargovanVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargovanVolume);
    }

    @Override
    public int compareTo(Cargovan cargovan) {
        return Double.compare(this.getCargovanVolume(), cargovan.getCargovanVolume());
    }

    @Override
    public int compare(Cargovan firstCargovan, Cargovan secondCargovan) {
        return Boolean.compare(firstCargovan.getVehicleAvailability(), secondCargovan.getVehicleAvailability());
    }
}
