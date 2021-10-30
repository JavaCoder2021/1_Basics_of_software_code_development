//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
//дробную и целую части числа и вывести полученное значение числа. 

package task4;

public class Task4 {
    
    public static void main(String[] args) {
        
        double R = func(125.111);
        System.out.printf("R = %.3f \n", R);
       
    }
    
    //function
    public static double func(double x) {
        
        double pZ = (x * 1000) % 1000 + (int) x / 1000.0;
        return pZ;
       
    }
    
}
