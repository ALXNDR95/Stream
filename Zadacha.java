package Homework.Modul14;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Zadacha {
    public static void main(String[] args) {
        MyBerries berries;
        berries = (strawberries,blueberries,raspberries) -> strawberries + blueberries + raspberries;

        double TotalPrice = berries.getPrice(500, 750.5, 800.2);
        System.out.println("Total price for berries: " + TotalPrice);

        IntStream intStream = IntStream.of(500, 750, 800);
        OptionalDouble AvrPrice = intStream.average();
        System.out.println("Average price of  berries is");
        if (AvrPrice.isPresent()) {
            System.out.println(AvrPrice.getAsDouble());
        } else {
            System.out.println("They are free of charge!!!");
        }
    }
}
