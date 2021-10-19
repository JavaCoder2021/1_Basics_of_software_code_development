//Циклы. 1. Напишите программу, где пользователь вводит любое целое положительное число. 
//А программа суммирует все числа от 1 до введенного пользователем числа. 

package task_21;

import java.util.Scanner;

public class Task_21 {
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число > 1: ");
        int a = input.nextInt();
        a = Math.abs(a);
        int summa = 0;
        
        for (int i = 1; i <= a; i++)
        {
            summa += i;
        }  
        
        System.out.println("Сумма чисел равна: " + summa);
    }
    
}