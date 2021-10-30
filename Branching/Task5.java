//Ветвления. 5. Вычислить значение функции:

package task5;

public class Task5 {
    
    public static void main(String[] args) {
        
        System.out.println(F(2));
            
    }
    
    //function
    public static double F(double x) {
       
        double pZ;
        
        if ( x <=3 ) 
            pZ = Math.pow(x, 2) - 3 * x + 9;
        else 
            pZ = 1 / ( Math.pow(x, 3) + 6 );
        
        return pZ;
       
    }
    
}
