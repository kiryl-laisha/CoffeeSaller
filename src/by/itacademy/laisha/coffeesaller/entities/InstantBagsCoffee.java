package by.itacademy.laisha.coffeesaller.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class InstantBagsCoffee extends Coffee implements Comparable<InstantBagsCoffee>, Comparator<InstantBagsCoffee> {

    private static final String FOOD_PRODUCT_TYPE = "Instant bags coffee";
    private static ArrayList<InstantBagsCoffee> instantBagsCoffees = new ArrayList<>();

    public InstantBagsCoffee() {
    }

    public InstantBagsCoffee(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        super(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity);
    }

    @Override
    public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        instantBagsCoffees.add(new InstantBagsCoffee(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity));
    }

    public ArrayList<InstantBagsCoffee> getInstantBagsCoffees() {
        return instantBagsCoffees;
    }

    public void loadInstantBagsCoffeeDataBase() {
        addFoodProduct(FOOD_PRODUCT_TYPE, "NESCAFE \"3 в 1 Классик\"", 1.6E-3, 250.0, 9.9, 8350);
        addFoodProduct(FOOD_PRODUCT_TYPE, "Lavazza Crema E Gusto", 1.6E-3, 250.1, 6.1, 16100);
    }

    @Override
    public int compareTo(InstantBagsCoffee instantBagsCoffee) {
        return Double.compare(this.getFoodProductPrice(), instantBagsCoffee.getFoodProductPrice());
    }

    @Override
    public int compare(InstantBagsCoffee instantBagsCoffee1, InstantBagsCoffee instantBagsCoffee2) {
        return Double.compare(instantBagsCoffee1.getFoodProductWeight(), instantBagsCoffee2.getFoodProductWeight());
    }
}
