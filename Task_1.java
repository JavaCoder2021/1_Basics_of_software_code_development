package task_1;

public class Task_1 {
    
    //function
    public static int func(int a, int b, int c) {  
        
        int pZ = (( a - 3 ) * b/2 ) + c; 
        return pZ;  
        
    }

    public static void main(String[] args) {
        
        int z = func(1, 2, 3);
        System.out.println("z = " + z);
        
    }
    
}
