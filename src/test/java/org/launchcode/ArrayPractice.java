package org.launchcode;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        // Create and initialize an array with the following values
        // in a single line: 1, 1, 2, 3, 5, 8.
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        System.out.println("All values and odd numbers:");

        // Loop through the array and print out each value and only odd numbers
        for (int value : integerArray)
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
    }

    //continue here at step 3 of the ArrayPractice exercise