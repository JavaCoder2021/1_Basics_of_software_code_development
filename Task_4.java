//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
//дробную и целую части числа и вывести полученное значение числа. 

package task_4;

public class Task_4 {
    
    //function
    public static double func(double x) {
        
        double pZ = (x * 1000) % 1000 + (int) x / 1000.0;
        return pZ;
       
    }

    public static void main(String[] args) {
        
        double z = func(125.111);
        System.out.printf("z = %.3f \n", z);
       
    }
    
}
