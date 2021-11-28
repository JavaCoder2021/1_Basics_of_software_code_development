/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 */

package by.epam.basics.linear_programs;

import static java.lang.Math.*;

public class Task3 {
    
    public static void main(String[] args) {
        
        double z = func(60, 40);
        System.out.printf("z = %.1f \n", z);
       
    }
    
    /** 
     * @param x value in degrees
     * @param y value in degrees
     */
    public static double func(double x, double y) {
        
        double radiansX  = toRadians(x);
        double radiansY  = toRadians(y);
        double radiansXY = toRadians(x * y);
        double cosX  = cos(radiansX);
        double cosY  = cos(radiansY);
        double sinX  = sin(radiansX);
        double sinY  = sin(radiansY);
        double tanXY = tan(radiansXY);
        double z = ((sinX + cosY) / (cosX - sinY)) * tanXY;
        
        return z;
       
    }
    
}
