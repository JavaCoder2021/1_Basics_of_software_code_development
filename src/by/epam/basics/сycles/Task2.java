/*
 * Циклы. 2. 
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
package by.epam.basics.сycles;

public class Task2 {
         
    public static void main(String[] args) {
        
        double a = -5;
        double b = 10;
        double h = 3;
        
        func(a, b, h);

    }
    
    public static void func(double a, double b, double h) { 
        
        double y;
        
        for (double x = a; x <= b; x += h)
        {
            if (x > 2) 
                y = x;
            else 
                y = -x;
            System.out.print("  " + y + "  ");
        }
        
        System.out.println();
        
    }    
    
}
