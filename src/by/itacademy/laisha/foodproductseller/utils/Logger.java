package by.itacademy.laisha.foodproductseller.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Logger {

    private static final String LOGS_FILE_NAME = "src\\by\\itacademy\\laisha\\foodproductseller\\logs\\logs.txt";

    private Logger() {
    }

    public static void log(final Throwable exception){
        final StringWriter errors = new StringWriter();
        exception.printStackTrace(new PrintWriter(errors));

        try(PrintWriter printwriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(LOGS_FILE_NAME), true)))){
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            printwriter.println(sdf.format(Calendar.getInstance().getTime()));
            printwriter.println(exception.getMessage());
            printwriter.println(errors.toString());
        } catch (IOException e) {
            Logger.log(e);
        }
    }

    /**
     * Writes log in file
     * @param message - string
     */
    public static void log(final String message){
        try(PrintWriter printwriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(LOGS_FILE_NAME), true)))){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            printwriter.println(sdf.format(Calendar.getInstance().getTime()));
            printwriter.println(message);
        } catch (IOException e) {
            Logger.log(e);
        }
    }



}
