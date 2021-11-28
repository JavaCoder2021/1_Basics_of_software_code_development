/*
 * 4. 
 * Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и 
 * вывести полученное значение числа. 
 */

package by.epam.basics.linear_programs;

public class Task4 {
    
    public static void main(String[] args) {
        
        double R = 125.111;
        System.out.printf("R = %.3f \n", func(R));
       
    }
    
    public static double func(double x) {
        
        return (x * 1000) % 1000 + (int) x / 1000.0;
       
    }
    
}
