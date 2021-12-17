package by.itacademy.laisha.coffeesaller.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class InstantCansCoffee extends Coffee implements Comparable<InstantCansCoffee>, Comparator<InstantCansCoffee> {

    private static final String FOOD_PRODUCT_TYPE = "Instant cans coffee";
    private static ArrayList<InstantCansCoffee> instantCansCoffees = new ArrayList<>();

    public InstantCansCoffee() {
    }

    public InstantCansCoffee(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        super(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity);
    }

    @Override
    public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        instantCansCoffees.add(new InstantCansCoffee(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity));
    }

    public ArrayList<InstantCansCoffee> getInstantCansCoffees() {
        return instantCansCoffees;
    }

    public void loadInstantCansCoffeeDataBase() {
        addFoodProduct(FOOD_PRODUCT_TYPE, "Dallmayr Prodomo", 1.0E-5, 2., 0.3, 130500);
        addFoodProduct(FOOD_PRODUCT_TYPE, "Jacobs monarch", 1.0E-5, 2.1, 0.2, 28750);
    }

    @Override
    public int compareTo(InstantCansCoffee instantCansCoffee) {
        return Double.compare(this.getFoodProductPrice(), instantCansCoffee.getFoodProductPrice());
    }

    @Override
    public int compare(InstantCansCoffee instantCansCoffee1, InstantCansCoffee instantCansCoffee2) {
        return Double.compare(instantCansCoffee1.getFoodProductWeight(), instantCansCoffee2.getFoodProductWeight());
    }
}
