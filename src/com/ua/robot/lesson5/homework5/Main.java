package com.ua.robot.lesson5.homework5;

public class Main {
    public static void main(String[] args) {
        int x = 9;
        int y = 99;
        int z = 7;
        System.out.println("Question 1: What is maximum between x = " + x + " and y = " + y + " ?");
        System.out.println("Question 2: What is minimum between x = " + x + " and y = " + y + " ?");
        System.out.println("Question 3: Is z = " + z + " even or odd number ?");

        // max and min
        if (x == y) {
            System.out.println("Answer for 1 and 2 questions: The numbers are equal");
        }
        else if (x > y) {
            System.out.println("Answer 1: " + x + " is maximum");
            System.out.println("Answer 2: " + y + " is minimum");
        }
        else {
            System.out.println("Answer 1: " + y + " is maximum");
            System.out.println("Answer 2: " + x + " is minimum");
        }

        // even or odd
        if (z % 2 == 0) {
            System.out.println("Answer 3: " + z + " is even");
        }
        else {
            System.out.println("Answer 3: " + z + " is odd");
        }
    }
}
