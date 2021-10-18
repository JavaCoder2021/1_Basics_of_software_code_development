//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c. 

package task_1;

public class Task_1 {
    
    //function
    public static double func(double a, double b, double c) {  
        
        double pZ = (( a - 3 ) * b / 2 ) + c; 
        return pZ;  
        
    }

    public static void main(String[] args) {
        
        double z = func(1, 2, 3);
        System.out.printf("z = %.1f \n", z);
        
    }
    
}
