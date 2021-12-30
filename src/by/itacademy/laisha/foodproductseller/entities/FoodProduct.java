package by.itacademy.laisha.foodproductseller.entities;

import java.util.Objects;

public abstract class FoodProduct {

    private String foodProductClass; //TODO think again about constancy
    private String foodProductType;
    private String foodProductBrand;
    private int foodProductQuantity;
    private double foodProductPrice;
    private double foodProductWeight;
    private double foodProductVolume;

    public FoodProduct(String foodProductClass, String foodProductType, String foodProductBrand,
                       int foodProductQuantity, double foodProductPrice,
                       double foodProductWeight, double foodProductVolume) {
        this.foodProductClass = foodProductClass;
        this.foodProductType = foodProductType;
        this.foodProductBrand = foodProductBrand;
        this.foodProductQuantity = foodProductQuantity;
        this.foodProductPrice = foodProductPrice;
        this.foodProductWeight = foodProductWeight;
        this.foodProductVolume = foodProductVolume;
    }

    public String getFoodProductClass() {

        return foodProductClass;
    }

    public String getFoodProductType() {

        return foodProductType;
    }

    public void setFoodProductType(String foodProductType) {

        this.foodProductType = foodProductType;
    }

    public String getFoodProductBrand() {

        return foodProductBrand;
    }

    public void setFoodProductBrand(String foodProductBrand) {

        this.foodProductBrand = foodProductBrand;
    }

    public int getFoodProductQuantity() {

        return foodProductQuantity;
    }

    public void setFoodProductQuantity(int foodProductQuantity) {

        this.foodProductQuantity = foodProductQuantity;
    }

    public double getFoodProductPrice() {

        return foodProductPrice;
    }

    public void setFoodProductPrice(double foodProductPrice) {

        this.foodProductPrice = foodProductPrice;
    }

    public double getFoodProductWeight() {

        return foodProductWeight;
    }

    public void setFoodProductWeight(double foodProductWeight) {

        this.foodProductWeight = foodProductWeight;
    }

    public double getFoodProductVolume() {

        return foodProductVolume;
    }

    public void setFoodProductVolume(double foodProductVolume) {

        this.foodProductVolume = foodProductVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodProduct)) return false;
        FoodProduct foodProduct = (FoodProduct) o;
        return foodProductQuantity == foodProduct.foodProductQuantity &&
                Double.compare(foodProduct.foodProductPrice, foodProductPrice) == 0 &&
                Double.compare(foodProduct.foodProductWeight, foodProductWeight) == 0 &&
                Double.compare(foodProduct.foodProductVolume, foodProductVolume) == 0 &&
                foodProductClass.equals(foodProduct.foodProductClass) &&
                foodProductType.equals(foodProduct.foodProductType) &&
                foodProductBrand.equals(foodProduct.foodProductBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodProductClass, foodProductType, foodProductBrand,
                foodProductQuantity, foodProductPrice, foodProductWeight, foodProductVolume);
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "foodProductClass='" + foodProductClass + '\'' +
                ", foodProductType='" + foodProductType + '\'' +
                ", foodProductBrand='" + foodProductBrand + '\'' +
                ", foodProductQuantity=" + foodProductQuantity +
                ", foodProductPrice=" + foodProductPrice +
                ", foodProductWeight=" + foodProductWeight +
                ", foodProductVolume=" + foodProductVolume +
                '}';
    }
}
