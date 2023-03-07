package com.ua.robot.lesson10.homework10;

public class ArrayTest {
    public static void main(String[] args) {
        Array array = new Array();
        array.setLength(10);
        int[] ints = array.createArray(array.getLength());
        array.printArray(ints);

        ints = array.sortArrayUp(ints);
        array.printArray(ints);

        ints = array.sortArrayDoun(ints);
        array.printArray(ints);
    }
}
