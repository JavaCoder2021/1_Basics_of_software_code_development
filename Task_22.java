//Циклы. 2. Вычислить значения функции на отрезке [а,b] c шагом h:

package task_22;

public class Task_22 {
         
    public static void main(String[] args) {
        
        double a = -5;
        double b = 10;
        double h = 3;
        double y;
        
        for ( double x = a; x <= b; x += h)
        {
            if ( x > 2 ) y = x;
            else y = -x;
            System.out.print(y + " ");
        }

    }
    
}