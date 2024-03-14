package hoidanit;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] clubs = {"MU", "Mancity", "Liverpool"};

        System.out.println("run here array with length " + clubs.length);
        System.out.println("First element" + clubs[0]);
        System.out.println("First element" + clubs[1]);
        System.out.println("First element" + clubs[2]);
        System.out.println("run here array " + Arrays.toString(clubs));

        String[] array = new String[5];
        array[0] = "hello";

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

