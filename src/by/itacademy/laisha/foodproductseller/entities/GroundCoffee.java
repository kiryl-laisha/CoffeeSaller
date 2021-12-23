package by.itacademy.laisha.foodproductseller.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class GroundCoffee extends Coffee implements Comparable<GroundCoffee>, Comparator<GroundCoffee> {

    private static final String FOOD_PRODUCT_TYPE = "Ground coffee";
    private static ArrayList<GroundCoffee> groundCoffees = new ArrayList<>();

    public GroundCoffee() {
    }

    public GroundCoffee(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        super(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductQuantity, foodProductVolume, foodProductWeight, foodProductPrice);
    }

   // @Override
    //public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
      //  groundCoffees.add(new GroundCoffee(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity));
    //}

    public ArrayList<GroundCoffee> getGroundCoffees() {
        return groundCoffees;
    }

    public void loadGroundCoffeeDataBase() {
        addFoodProduct(FOOD_PRODUCT_TYPE, "Tchibo Family", 1.2E-3, 500.1, 5.7, 18960);
        addFoodProduct(FOOD_PRODUCT_TYPE, "Lavazza Сaffe Espresso", 1.3E-3, 500.0, 15.1, 6100);
    }

    @Override
    public int compareTo(GroundCoffee groundCoffee) {
        return Double.compare(this.getFoodProductPrice(), groundCoffee.getFoodProductPrice());
    }

    @Override
    public int compare(GroundCoffee groundCoffee1, GroundCoffee groundCoffee2) {
        return Double.compare(groundCoffee1.getFoodProductWeight(), groundCoffee2.getFoodProductWeight());
    }
}
