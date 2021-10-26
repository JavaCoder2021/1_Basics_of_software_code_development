//6. Для данной области составить линейную программу, которая печатает  true, если точка с координатами (х, у) 
//принадлежит закрашенной области, и false — в противном случае:  

package task_6;

public class Task_6 {
    
    public static void trueOrFalse(int x, int y) {
        
        if (x<-6 || x>8 || y<-4 || y>7 || x==0 || y==0)
        {
            System.out.println("Area x and y are set incorrectly");
        }
        else
        {
           if (y>=1 && y<=4 && Math.abs(x)<=2)       
               System.out.println("true");
           else if (y<=-1 && y>=-3 && Math.abs(x)<=4)
               System.out.println("true");
           else
               System.out.println("false");
        }      
    }

    public static void main(String[] args) {
        
        trueOrFalse(2,3);
       
    }
    
}
