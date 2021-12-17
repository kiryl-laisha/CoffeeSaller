package by.itacademy.laisha.coffeesaller.services;

import by.itacademy.laisha.coffeesaller.entities.CargoVan;
import by.itacademy.laisha.coffeesaller.utils.ScreenUtils;
import by.itacademy.laisha.coffeesaller.utils.TransportUtils;

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

