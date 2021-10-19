//Ветвления. 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
//Определить, будут ли они расположены на одной прямой.   

package task_13;

public class Task_13 {
    
    //function
    public static void points_on_line(double x1, double y1, double x2, double y2, double x3, double y3) {
        
        double k = ( (y2 - y1) / (x2 - x1) );
        double b = y1 - k * x1;
        if ( y3 == (k * x3 + b) ) System.out.println("Point on line");
        else System.out.println("! Point not on line");
       
    }
    
    public static void main(String[] args) {
        
        points_on_line(1, 1, 4, 4, 2, 2);
            
    }
    
}