//Ветвления. 2. Найти max{min(a, b), min(c, d)}.  

package task_12;

public class Task_12 {
    
    //function
    public static double max_is_min(double a, double b, double c, double d) {
        
        double minAB;
        double minCD;
        double max_is_min_abcd;
        
        if (a <= b) minAB = a; else minAB = b;
        if (c <= d) minCD = c; else minCD = d;
        if (minAB >= minCD) max_is_min_abcd = minAB; else max_is_min_abcd = minCD;
        return max_is_min_abcd;
        
    }
    
    public static void main(String[] args) {
        
        System.out.printf("max_is_min_abcd = %.1f\n", max_is_min(5,5,5,6));
            
    }
    
}