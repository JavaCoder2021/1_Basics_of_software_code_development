//Циклы. 1. Напишите программу, где пользователь вводит любое целое положительное число. 
//А программа суммирует все числа от 1 до введенного пользователем числа. 

package task1;

import java.util.Scanner;

public class Task1 {
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer > 1: ");
        int a = input.nextInt();
        while (a <= 0)
        {
            System.out.print("Please enter an integer > 1: ");
            a = input.nextInt();
        }
        
        a = Math.abs(a);
        int summa = 0;
        
        for (int i = 1; i <= a; i++)
        {
            summa += i;
        }  
        
        System.out.println("The sum of the numbers is: " + summa);
    }
    
}
