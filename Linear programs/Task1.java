//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c. 

package task1;

public class Task1 {
    
    public static void main(String[] args) {
        
        double z = func(1, 2, 3);
        System.out.printf("z = %.1f \n", z);
        
    }
    
    //function
    public static double func(double a, double b, double c) {  
        
        double pZ = (( a - 3 ) * b / 2 ) + c; 
        return pZ;  
        
    }
    
}
