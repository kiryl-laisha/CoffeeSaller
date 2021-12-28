package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.entities.*;
import by.itacademy.laisha.foodproductseller.utils.*;

import java.util.ArrayList;

public class Transport {

    private static ArrayList <Cargovan> cargovans = new ArrayList<>();

    public static void loadTransportDatabases() {

        Logger.log("Entered the method Transport.loadTransportDatabases();");
        TransportUtils.loadVehiclesDatabases();
        cargovans = TransportUtils.getCargovans();
        ScreenUtils.printString("The transport databases have been loaded;");
        Logger.log("The transport databases have been loaded;\n" +
                "Exited the method Transport.loadTransportDatabases();");
    }
}

