package org.launchcode;

import java.util.Arrays;


public class ArrayPractice {
    public String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
            "I will not eat them in a house. I will not eat them with a mouse.";
    public static void main(String[] args) {
        // Create and initialize an array with the following values
        // in a single line: 1, 1, 2, 3, 5, 8.
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Odd numbers:");

        // Loop through the integerArray and print out each odd number
        for (int numbers : integerArray)

            if (numbers % 2 != 0) {
                System.out.println(numbers);
            }


        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        //Use the split method to divide the string at each space and store the individual words in an array
        String[] words = phrase.split(" ");
        //print the Array of words to verify that the code works.
        System.out.println(Arrays.toString(words));
        //change the delimiter to .split() the String into separate sentences.
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
        }
    }





