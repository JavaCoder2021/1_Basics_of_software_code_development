/*
Ветвления. 4. 
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
Определить, пройдет ли кирпич через отверстие.   
*/

package by.epam.basics.branching;

import java.util.Arrays;

public class Task4 {
    
    public static void main(String[] args) {
        
        brickHole(4, 5, 7, 3.5, 4.5);
            
    }
    
    public static void brickHole(double A, double B, double x, double y, double z) {
       
        double[] hole = new double[2];
        double[] brick = new double[3];
        hole[0] = A;
        hole[1] = B;
        brick[0] = x;
        brick[1] = y;
        brick[2] = z;
        
        Arrays.sort(hole);
        Arrays.sort(brick);
        
        if (brick[0] < hole[0] && brick[1] < hole[1] )
            System.out.println("True");
        else 
            System.out.println("False");
       
    }    
    
}
