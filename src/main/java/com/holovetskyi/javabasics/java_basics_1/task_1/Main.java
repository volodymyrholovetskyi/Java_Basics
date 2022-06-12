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
        boolean isDivisor = true;
        int count = 0;

        while (isDivisor) {

            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int countFirstNumber = countNumberCommonDivisors(firstNumber);
            int countSecondNumber = countNumberCommonDivisors(secondNumber);

            count = countFirstNumber + countSecondNumber;

            if (count <= 1) {
                System.out.println("\nCount should be greater than: 1 \n");
            } else if (firstNumber % count == 0 || secondNumber % count == 0) {
                isDivisor = false;
            }
        }
    }

    public static int countNumberCommonDivisors(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
