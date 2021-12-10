package by.itacademy.laisha.coffeesaller.warehouse;

import by.itacademy.laisha.coffeesaller.screen.Screen;
import by.itacademy.laisha.coffeesaller.warehouse.foodproduct.coffee.*;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private BeanCoffee beanCoffee1;
    private GroundCoffee groundCoffee1;
    private InstantCansCoffee instantCansCoffee1;
    private InstantBagsCoffee instantBagsCoffee1;
    private static Screen screen;
    private List<Coffee> coffees = new ArrayList<>();

    public Warehouse() {
        beanCoffee1 = new BeanCoffee(3.2E-3, 1.0, 12.4, 12260, 1);
        coffees.add(beanCoffee1);
        groundCoffee1 = new GroundCoffee(1.2E-3, 0.5, 7.7, 8260, 2);
        coffees.add(groundCoffee1);
        instantCansCoffee1 = new InstantCansCoffee(1.6E-3, 0.5, 8.9, 4350, 3);
        coffees.add(instantCansCoffee1);
        instantBagsCoffee1 = new InstantBagsCoffee(1.0E-5, 0.005, 0.3, 130500, 4);
        coffees.add(instantBagsCoffee1);
    }

public void addFoodProduct(double foodProductVolume, double foodProductWeight, double foodProductCost, int foodProductQuantity) {

}




    public void loadWarehouseDataBase() {
        screen.printScreen("Warehouse database had loaded.");

    }
}
