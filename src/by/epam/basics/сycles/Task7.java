/*
 * Циклы. 7. 
 * Для каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры. 
 */
package by.epam.basics.сycles;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        
        int m = scannerInt("Enter the number m > 0: ");
        int n = scannerInt("Enter the number n > 0: ");
        
        if (m > n) 
            System.out.println("! m > n");
        else
        for (int i = m; i <= n; i++) {
            
            System.out.print("Divisors of a number " + i + " : ");
            
            for (int a = 2; a < i; a++) {
                
                if (i % a == 0) 
                    System.out.print(" " + a + " ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
    private static int scannerInt(String str) {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print(str);
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
