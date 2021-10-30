//Циклы. 5. Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  
//модуль  которых  больше  или  равен заданному е. Общий член ряда имеет вид: 

package task5;

public class Task5 {
         
    public static void main(String[] args) {
       
        System.out.println("The sum of the members of the series: " + func(1, 10, 2, 0.1));

    }
    
    public static double func(int start, int finish, int n, double e) {
        
        double summ = 0;
        double summObj = 0;
        for (int i = start; i <= finish; i++)
        {
            summObj = 1 / ( Math.pow(i, n) );
            if (Math.abs(summObj) >= e) summ += summObj;
        } 
        return summ;
            
    }
    
}