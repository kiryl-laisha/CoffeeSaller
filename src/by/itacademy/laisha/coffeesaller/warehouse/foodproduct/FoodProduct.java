package by.itacademy.laisha.coffeesaller.warehouse.foodproduct;

public class FoodProduct {

    private double foodProductVolume;
    private double foodProductWeight;
    private double foodProductCost;
    private int foodProductQuantity;

    public FoodProduct(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity) {
        this.foodProductVolume = foodProductVolume;
        this.foodProductWeight = foodProductWeight;
        this.foodProductCost = foodProductCost;
        this.foodProductQuantity = foodProductQuantity;
    }

    public void setFoodProductVolume(double foodProductVolume) {
        this.foodProductVolume = foodProductVolume;
    }

    public double getFoodProductVolume() {
        return foodProductVolume;
    }

    public void setFoodProductWeight(double foodProductWeight) {
        this.foodProductWeight = foodProductWeight;
    }

    public double getFoodProductWeight() {
        return foodProductWeight;
    }

    public void setFoodProductCost(double foodProductCost) {
        this.foodProductCost = foodProductCost;
    }

    public double getFoodProductCost() {
        return foodProductCost;
    }

    public void setFoodProductQuantity(int foodProductQuantity) {
        this.foodProductQuantity = foodProductQuantity;
    }

    public double getFoodProductQuantity() {
        return foodProductQuantity;
    }

    public void addFoodProductQuantity(int foodProductQuantity) {
        this.foodProductQuantity = this.foodProductQuantity + foodProductQuantity;
    }
}
