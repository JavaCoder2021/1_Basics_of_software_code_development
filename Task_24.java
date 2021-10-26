//Циклы. 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

package task_24;

import java.math.*;

public class Task_24 {
         
    public static void main(String[] args) {
        
        BigInteger proizv = BigInteger.valueOf(1);
                       
        for ( int i = 2; i <= 200; i++)
        {
            proizv = proizv.multiply(BigInteger.valueOf((long) i * i));
        }
        
        System.out.println("Product of the squares of the first two hundred numbers: " + proizv);

    }
    
}
