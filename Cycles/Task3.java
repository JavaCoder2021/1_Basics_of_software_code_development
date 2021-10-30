//Циклы. 3. Найти сумму квадратов первых ста чисел. 

package task3;

public class Task3 {
         
    public static void main(String[] args) {
        
        int summa = 0;
               
        for ( int i = 1; i <= 100; i++)
        {
            summa += i * i;
        }
        
        System.out.println("Sum of the squares of the first hundred numbers: " + summa);

    }
    
}
