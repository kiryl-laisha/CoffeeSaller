package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.entities.*;
import by.itacademy.laisha.foodproductseller.utils.*;

public class Transport {

    private static CargoVan cargoVan = new CargoVan();
    private static ScreenUtils screen = new ScreenUtils();

    public Transport() {
    }

    public void loadTransportDatabase() { //emulation
        //miniVan.loadMiniVanDatabase(); will be used to expand the program
        //car.loadCarDatabase(); will be used to expand the program
        cargoVan.loadCargoVanDataBase();
        screen.printString("Transport database had loaded.");
    }
}

