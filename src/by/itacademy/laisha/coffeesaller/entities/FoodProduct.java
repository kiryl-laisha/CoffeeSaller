package by.itacademy.laisha.coffeesaller.entities;

public abstract class FoodProduct {

    private String foodProductBrand;
    private String FOOD_PRODUCT_TYPE;
    private int foodProductQuantity;
    private double foodProductPrice;
    private double foodProductVolume;
    private double foodProductWeight;


    public FoodProduct() {
    }

    public FoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        this.foodProductBrand = foodProductBrand;
        this.FOOD_PRODUCT_TYPE = FOOD_PRODUCT_TYPE;
        this.foodProductQuantity = foodProductQuantity;
        this.foodProductPrice = foodProductPrice;
        this.foodProductVolume = foodProductVolume;
        this.foodProductWeight = foodProductWeight;

    }

    public void setFoodProductBrand(String foodProductBrand) {
        this.foodProductBrand = foodProductBrand;
    }

    public String getFoodProductBrand() {
        return foodProductBrand;
    }

    public String getFoodProductType() {
        return FOOD_PRODUCT_TYPE;
    }

    public void setFoodProductQuantity(int foodProductQuantity) {
        this.foodProductQuantity = foodProductQuantity;
    }

    public int getFoodProductQuantity() {
        return foodProductQuantity;
    }

    public void setFoodProductPrice(double foodProductPrice) {
        this.foodProductPrice = foodProductPrice;
    }

    public double getFoodProductPrice() {
        return foodProductPrice;
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

    public void addFoodProductQuantity(int foodProductQuantity) {
        this.foodProductQuantity = this.foodProductQuantity + foodProductQuantity;
    }

    public abstract void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity);
}
