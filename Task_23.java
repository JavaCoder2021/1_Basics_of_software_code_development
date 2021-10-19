//Циклы. 3. Найти сумму квадратов первых ста чисел. 

package task_23;

public class Task_23 {
         
    public static void main(String[] args) {
        
        int summa = 0;
               
        for ( int i = 1; i <= 100; i++)
        {
            summa += i * i;
        }
        
        System.out.println("Сумма квадратов первых ста чисел: " + summa);

    }
    
}