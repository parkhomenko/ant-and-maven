package com.hillel;

public class Algorithm {

    public boolean numbersExist(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[left] + array[right] == number) {
                return true;
            }

            if (array[left] + array[right] < number) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
