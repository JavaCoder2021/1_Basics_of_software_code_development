//Ветвления. 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
//и если да, то будет ли он прямоугольным. 

package task_11;

public class Task_11 {
    
    public static void main(String[] args) {
        
        double angle1 = 50.0;
        double angle2 = 45.0;
        
        if ( angle1 > 0 && angle2 > 0 && ((angle1 + angle2) < 180) ) 
            System.out.println("Triangle true");
        else
            System.out.println("Triangle false");
        
        if ((angle1 + angle2) == 90.0)
            System.out.println("Triangle rectangular");
        else
            System.out.println("Triangle not rectangular");
    }
    
}