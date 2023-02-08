package com.ua.robot.lesson6.homework6;

public class Main {

    public static void main(String[] args) {

        //Створити програму для виведення чисел від 1 до 10
        System.out.println();
        System.out.println("1) виведення чисел від 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //Показати всі парні числа в діапазоні від 1 до 100
        System.out.println();
        System.out.println();
        System.out.println("2) всі парні числа в діапазоні від 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Знайти факторіал числа 7 (варіант 1)
        System.out.println();
        System.out.println();
        System.out.print("3.1) факторіал числа 7: ");
        int end = 7;
        int start = 1;
        int result = 1;
        while (start <= end) {
            result *= start;
            start++;
/*            result = result * start;
            start = start + 1;*/
        }
        System.out.print(result);


        //Знайти факторіал числа 7 (варіант 2)
        System.out.println();
        System.out.println();
        System.out.print("3.2) факторіал числа 7: ");
        int total = 1;
        for (int i = 1; i <= 7; i++) {
            total *= i; //total = total * i
               }
        System.out.print(total);

        //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        System.out.println();
        System.out.println();
        System.out.println("4) числа Фібоначчі до 100: ");
        int x = 0;
        int y = 1;
        System.out.print(x + " " + y + " ");
        for (int i = 2; ; i++) {
            int z = x + y;
            x = y;
            y = z;
            if (z >= 100) {
                break;
            }
            System.out.print(z + " ");
        }
    }
}
