/*
 * 1. Найдите значение функции: z = ((a – 3 ) * b / 2) + c. 
 */

package by.epam.basics.linear_programs;

public class Task1 {
    
    public static void main(String[] args) {
        
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        
        double z = func(a, b, c);
        System.out.printf("z = %.1f \n", z);
        
    }
    
    public static double func(double a, double b, double c) {  
        
        return (( a - 3 ) * b / 2 ) + c;  
        
    }
    
}
