/*
 * Циклы. 3. 
 * Найти сумму квадратов первых ста чисел. 
 */
package by.epam.basics.сycles;

public class Task3 {
         
    public static void main(String[] args) {
        
        int sum = 0;
               
        for (int i = 1; i <= 100; i++) {
            
            sum += i * i;
            
        }
        
        System.out.println("Sum of the squares of the first hundred numbers: " + sum);

    }
    
}
