package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.*;
import by.itacademy.laisha.foodproductseller.enums.VehicleTypes;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TransportUtils {

    private static final String INPUT_FILES_FOLDER = "src\\by\\itacademy\\laisha\\foodproductseller\\files\\input\\";

    private static ArrayList<Cargovan> cargovans;

    public TransportUtils() {
    }

    public static void loadVehiclesDatabases() {

        Logger.log("Entered the method TransportUtils.loadVehiclesDatabase();");
        //loadMinivansDatabase(); will be used to expand the program
        //loadCarsDatabase(); will be used to expand the program
        loadCargovansDatabase();
        Logger.log("The vehicles databases have been loaded;\n" +
                "Exited the method TransportUtils.loadVehiclesDatabases();");
    }

    private static void loadCargovansDatabase() {

        cargovans = new ArrayList<>();

        Logger.log("Entered the method TransportUtils.loadCargovansDatabase();");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(INPUT_FILES_FOLDER +
                "cargovans" + ".txt"))).useDelimiter(";")) {
            while (scanner.hasNextLine()) {
                cargovans.add(new Cargovan(scanner.next().trim(), scanner.next().trim(),
                        scanner.next().trim(), Double.parseDouble(scanner.next().trim()),
                        Boolean.parseBoolean(scanner.next().trim())));
            }
            scanner.close();
            Logger.log("The cargovans database has been loaded;");
        } catch (FileNotFoundException fileNotFoundException) {
            Logger.log("The named file was not found or for some other reason could not be opened for reading;");
        } catch (NullPointerException nullPointerException) {
            Logger.log("The named file is empty;");
        } catch (NoSuchElementException noSuchElementException) {
            Logger.log("The named file does not contain the required amount of information;");
        } catch (Exception exception) {
            Logger.log("The cargovans database has been loaded incorrectly;");
        }
        Logger.log("The cargovans database has been loaded;\n" +
                "Exited the method TransportUtils.loadCargovansDatabase();");
    }

    public static ArrayList<Cargovan> getCargovans() {
        return cargovans;
    }

    public static void addVehiclePosition(String vehicleType) {

        Logger.log("Entered the method TransportUtils.addVehiclePosition();");
        if (vehicleType.equals(VehicleTypes.CARGOVAN.getVehicleType())) {
            addCargovan();
        }
/*        if (vehicleType.equals(VehicleTypes.MINIVAN.getVehicleType())) {
            addMinivan();
        }
        if (vehicleType.equals(VehicleTypes.CAR.getVehicleType())) {
            addCar();
        }
*/
        Logger.log("Exited the method TransportUtils.addVehiclePosition();");
       }

    private static void addCargovan() {

        Logger.log("Entered the method TransportUtils.addCargovan();");
        cargovans.add(new Cargovan(
                MenuUtils.getNewPositionBrand(),
                MenuUtils.getNewPositionModel(),
                MenuUtils.getNewPositionRegisterSign(),
                MenuUtils.getNewPositionVolume(),
                MenuUtils.getNewPositionAvailability()));
        Logger.log("Exited the method TransportUtils.addCargovan();");
    }
}
