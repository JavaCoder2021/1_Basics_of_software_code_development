/*
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

package by.epam.basics.linear_programs;

public class Task2 {
    
    public static void main(String[] args) {
        
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        
        double z = func(a, b, c);
        System.out.println("z = " + z);
        
    }
    
    public static double func(double a, double b, double c) {  
        
        double z = ( b + Math.sqrt( Math.pow(b, 2) + 4 * a * c ) ) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        return z;  
        
    }
    
}
