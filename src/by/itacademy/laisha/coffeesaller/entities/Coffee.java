package by.itacademy.laisha.coffeesaller.entities;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends FoodProduct {


    private static final BeanCoffee beanCoffee = new BeanCoffee();
    private static final GroundCoffee groundCoffee = new GroundCoffee();
    private static final InstantBagsCoffee instantBagsCoffee = new InstantBagsCoffee();
    private static final InstantCansCoffee instantCansCoffee = new InstantCansCoffee();

    public Coffee() {
        super();
    }

    public Coffee(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
        super(FOOD_PRODUCT_TYPE, foodProductBrand, foodProductVolume, foodProductWeight, foodProductPrice, foodProductQuantity);
    }

    public void loadCoffeeDataBase() {
        beanCoffee.loadBeanCoffeeDataBase();
        groundCoffee.loadGroundCoffeeDataBase();
        instantBagsCoffee.loadInstantBagsCoffeeDataBase();
        instantCansCoffee.loadInstantCansCoffeeDataBase();
    }

    public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
    }
}
