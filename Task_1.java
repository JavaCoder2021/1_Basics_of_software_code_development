package task_1;

public class Task_1 {
    
    //Функция
    public static int func(int a, int b, int c) {  
        
        int pZ = (( a - 3 ) * b/2 ) + c; 
        return pZ;  
        
    }

    public static void main(String[] args) {
        
        int z = func(5, 10, 20);
        System.out.println("z=" + z);
        
    }
    
}
