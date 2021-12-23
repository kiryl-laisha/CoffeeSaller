package by.itacademy.laisha.foodproductseller.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class BeanCoffee extends Coffee implements Comparable<BeanCoffee>, Comparator<BeanCoffee> {

    private static final String FOOD_PRODUCT_TYPE = "Bean coffee";
    private static ArrayList<BeanCoffee> beanCoffees = new ArrayList<>();

    public BeanCoffee() {
    }

    public BeanCoffee(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        super(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductQuantity, foodProductVolume, foodProductWeight, foodProductPrice);
    }

   // @Override
    //public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
      //  beanCoffees.add(new BeanCoffee(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity));
    //}

    public ArrayList<BeanCoffee> getBeanCoffees() {
        return beanCoffees;
    }

    public void loadBeanCoffeeDataBase() {
        addFoodProduct(FOOD_PRODUCT_TYPE, "Tchibo Barista Espresso", 3.2E-3, 1000.0, 12.4, 8240);
        addFoodProduct(FOOD_PRODUCT_TYPE, "Lavazza Qualita Oro", 3.1E-3, 1000.1, 12.1, 12260);
    }

    @Override
    public String getFoodProductType() {
        return FOOD_PRODUCT_TYPE;
    }

    @Override
    public int compareTo(BeanCoffee beanCoffee) {
        return Double.compare(this.getFoodProductPrice(), beanCoffee.getFoodProductPrice());
    }

    @Override
    public int compare(BeanCoffee beanCoffee1, BeanCoffee beanCoffee2) {
        return Double.compare(beanCoffee1.getFoodProductWeight(), beanCoffee2.getFoodProductWeight());
    }
}
