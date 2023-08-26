package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
//Write a static method to find the sum of all the even numbers in an ArrayList.
    public static int sumEven(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
//Write a static method to print out each word in a list that has exactly 5 letters.

    public static void printWordsWithGivenLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
//Within main, create a list with at least 10 integers and call your method on the list.
//Modify your code to prompt the user to enter the word length for the search.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(12);
        numbers.add(7);
        numbers.add(4);
        numbers.add(8);
        numbers.add(6);
        numbers.add(9);
        numbers.add(3);

        int evenSum = sumEven(numbers);
        System.out.println("Sum of even numbers: " + evenSum);

        // Instead of creating our own hard coded list of words
        // Use the string from the ArrayPractice class to split a string into the ArrayList collection.

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] wordsArray = arrayPractice.phrase.split(" ");

        /*
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("lemon");
        words.add("peach");
        words.add("kiwi");
        words.add("pear");
        words.add("plum");
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word length to search for: ");
        int searchLength = scanner.nextInt();

        System.out.println("Words with exactly " + searchLength + " letters:");
        printWordsWithGivenLength(new ArrayList<>(Arrays.asList(wordsArray)), searchLength);
    }
}
