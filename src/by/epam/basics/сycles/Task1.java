/*
 * Циклы. 1. 
 * Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
package by.epam.basics.сycles;

import java.util.Scanner;

public class Task1 {
      
    public static void main(String[] args) {
                  
        int num = scannerInt(); 
        int summa = 0;
        
        for (int i = 1; i <= num; i++)
            summa += i;
        
        System.out.println("The sum of the numbers is: " + summa);
        
    }
    
    private static int scannerInt() {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print("Please enter an integer > 0: ");
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }
    
}
