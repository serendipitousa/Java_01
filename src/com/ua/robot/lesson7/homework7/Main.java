package com.ua.robot.lesson7.homework7;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        //print raise a number to cube
        System.out.println(numberToCube(x));
        System.out.println(numberToCube(11));

        //print "*" n times
        printSymbol(11);
        printSymbol(x);

        //print a symbol n times
        char a = '$';
        char b = '%';
        printSymbol(a, 13);
        printSymbol(b, x);
        printSymbol('#', 41);


    }
    static int numberToCube(int number){
        return number * number * number;

    }
    static void printSymbol(int times){
        for (int i = 0; i < times; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSymbol(char c, int times){
        for (int i = 0; i < times; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
