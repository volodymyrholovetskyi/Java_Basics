package com.holovetskyi.javabasics.java_basics_1.task_1;

import java.util.Scanner;

/**
 * Napisz program, w którym pobierasz od użytkownika dwie liczby
 * całkowite, dopóki ilość wspólnych dodatnich dzielników tych liczb nie
 * będzie dzielnikiem jednej z pobranych liczb. Ilość dzielników nie
 * powinna uwzględniać liczby 1 oraz liczby, której dzielniki wyznaczamy
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean isDivisor= true;

        while (isDivisor) {

            System.out.println("Enter the first number: ");
            countNumberCommonDivisors(scanner.nextInt());

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();


        }
    }

    public static int countNumberCommonDivisors(int number){
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number%i == 0){
                count++;
            }
        }
        return count;
    }
}
