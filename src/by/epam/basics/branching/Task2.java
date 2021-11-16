/*
Ветвления. 2. 
Найти max{min(a, b), min(c, d)}.  
*/

package by.epam.basics.branching;

public class Task2 {
    
    public static void main(String[] args) {
        
        System.out.printf("max_is_min_abcd = %.1f \n", max_is_min(4, 5, 5, 6));
            
    }
    
    public static double max_is_min(double a, double b, double c, double d) {
        
        double minAB;
        double minCD;
        double max_is_min_abcd;
        
        if (a <= b) 
            minAB = a; 
        else 
            minAB = b;
        
        if (c <= d) 
            minCD = c; 
        else 
            minCD = d;
        
        if (minAB >= minCD) 
            max_is_min_abcd = minAB; 
        else 
            max_is_min_abcd = minCD;
        
        return max_is_min_abcd;
        
    }    
    
}