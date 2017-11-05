package com.hillel;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 3, 11, 12, 35};
        int numberToFind = 23;

        Algorithm algorithm = new Algorithm();
        boolean result = algorithm.numbersExist(array, numberToFind);

        if (result) {
            System.out.println("Numbers exist");
        } else {
            System.out.println("There are no such numbers");
        }
    }
}
