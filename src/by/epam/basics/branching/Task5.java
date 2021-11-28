/*
 * Ветвления. 5. 
 * Вычислить значение функции:
 */

package by.epam.basics.branching;

public class Task5 {
    
    public static void main(String[] args) {
        
        System.out.println(F(2));
        System.out.println(F(4));        
            
    }
    
    public static double F(double x) {
       
        double z;
        
        if ( x <=3 ) 
            z = Math.pow(x, 2) - 3 * x + 9;
        else 
            z = 1 / ( Math.pow(x, 3) + 6 );
        
        return z;
       
    }    
    
}
