package com.ua.robot.lesson8.homework8;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = setArray(1, 21);
        System.out.println("1) Create an array with size of 10 elements");
        System.out.print("2) Print the array: ");
        printArray(array);
        System.out.println();
        System.out.println("3) Get the MIN-element: " + getMinElement(array));
        System.out.println("4) Get the MAX-element: " + getMaxElement(array));
        System.out.println("5) Get the Average of all the elements: " + getAverageOfArray(array));
        System.out.println("6) Get the Total Sum of all the elements: " + getTotalSumOfElements(array));
    }
    static int[] setArray(int minRandom, int maxRandom) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minRandom, maxRandom);
        }
        return array;
    }
    static void printArray(int[] array) {
        for (int Element : array) {
            System.out.print(Element + " ");
        }
    }
    static int getMinElement(int[] arr) {
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
        }
        return minElem;
    }
    static int getMaxElement(int[] arr) {
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
    static double getAverageOfArray(int[] arr) {
        return ((double) getTotalSumOfElements(arr) / arr.length);
    }
    static int getTotalSumOfElements(int[] arr) {
        int sumElem = 0;
        for (int elem : arr) {
            sumElem += elem;
        }
        return sumElem;
    }
}