/*
Ветвления. 2. 
Найти max{min(a, b), min(c, d)}.  
*/

package by.epam.basics.branching;

public class Task2 {
    
    public static void main(String[] args) {
        
        System.out.printf("max_is_min_abcd = %.1f \n", maxIsMin(4, 5, 5, 6));
            
    }
    
    public static double maxIsMin(double a, double b, double c, double d) {
        
        double minAB;
        double minCD;
        double maxIsMinABCD;
        
        if (a <= b) 
            minAB = a; 
        else 
            minAB = b;
        
        if (c <= d) 
            minCD = c; 
        else 
            minCD = d;
        
        if (minAB >= minCD) 
            maxIsMinABCD = minAB; 
        else 
            maxIsMinABCD = minCD;
        
        return maxIsMinABCD;
        
    }    
    
}
