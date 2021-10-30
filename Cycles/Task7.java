//Циклы. 7. Для каждого натурального числа в промежутке от m до n вывести все делители, 
//кроме единицы и самого числа. m и n вводятся с клавиатуры. 
  
package task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number m: ");
        int m = input.nextInt();
        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        
        if (m > n) 
            System.out.println("! m > n");
        else
        for (int i = m; i <= n; i++)
        {
            
            System.out.print("Divisors of a number " + i + " : ");
            
            for (int a = 2; a < i; a++)
            {
                if (i % a == 0) 
                    System.out.print(" " + a + " ");
            }
            
            System.out.print("\n");
            
        }
        
    }
    
}
