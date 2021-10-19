//Ветвления. 5. Вычислить значение функции:

package task_15;

public class Task_15 {
    
    //function
    public static double F(double x) {
       
        double pZ;
        
        if ( x <=3 ) pZ = Math.pow(x, 2) - 3 * x + 9;
        else pZ = 1 / ( Math.pow(x, 3) +6 );
        
        return pZ;
       
    }
    
    public static void main(String[] args) {
        
        System.out.println(F(2));
            
    }
    
}