package task_2;

public class Task_2 {
    
    //Функция
    public static double func(int a, int b, int c) {  
        
        double pZ = ( b + (int) Math.sqrt( Math.pow(b, 2) + 4 * a * c ) ) / 2 * a - (int) Math.pow(a, 3) * c + (int) Math.pow(b, -2);
        return pZ;  
        
    }

    //Основной класс
    public static void main(String[] args) {
        
        double z = func(1, 2, 3);
        System.out.println("z=" + z);
        
    }
    
}