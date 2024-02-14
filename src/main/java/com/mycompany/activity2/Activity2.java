/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;

/**
 *
 * @author Jelan
 */
public class Activity2 {

    public static void main(String[] args) {
        
        // 1. Declare and initialize an array of integers with at least 5 elements
        int[] myArray = {9000, 700, 7000, 4500, 100};

        // 2. Print Each element of the array on a new line
        System.out.println("Array Elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // 3. Calculate and Print Array Sum
        int arraySum = 0;
        for (int num : myArray) {
            arraySum += num;
        }
        System.out.println("\nArray Sum: " + arraySum);

        // 4. Find the Maximum Value without using loops
        int maxValue = findMaxValue(myArray);
        System.out.println("Maximum Value: " + maxValue);
    }

    // Helper method to find the maximum value in the array
    private static int findMaxValue(int[] array) {
        // Assuming the array has at least one element
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}

